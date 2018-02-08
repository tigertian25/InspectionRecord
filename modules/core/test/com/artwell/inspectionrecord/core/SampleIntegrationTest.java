package com.artwell.inspectionrecord.core;

import com.artwell.inspectionrecord.InspectionrecordTestContainer;
import com.artwell.inspectionrecord.entity.Employee;
import com.artwell.inspectionrecord.entity.HtEmpl;
import com.artwell.inspectionrecord.entity.Job;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.security.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import java.util.List;

import javax.persistence.NoResultException;

import static org.junit.Assert.assertEquals;

public class SampleIntegrationTest {

    @ClassRule
    public static InspectionrecordTestContainer cont = InspectionrecordTestContainer.Common.INSTANCE;

    private Metadata metadata;
    private Persistence persistence;
    private DataManager dataManager;

    @Before
    public void setUp() throws Exception {
        metadata = cont.metadata();
        persistence = cont.persistence();
        dataManager = AppBeans.get(DataManager.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLoadUser() {
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            TypedQuery<User> query = em.createQuery(
                    "select u from sec$User u where u.login = :userLogin", User.class);
            query.setParameter("userLogin", "admin");
            List<User> users = query.getResultList();
            tx.commit();
            assertEquals(1, users.size());
        }
    }
    @Test
    public void getEmployee() {
    	try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
           List<Employee> employees = em.createQuery("select o from inspectionrecord$Employee o where o.htEmplId = :htEmplId",Employee.class)
                    .setParameter("htEmplId",99800126)
                    .getResultList();
            tx.commit();
            assertEquals(1, employees.size());
        } catch(NoResultException e) {
            return ;
        }
    }
    @Test
    public void getJob() {
    	try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
           List<Job> jobs =  em.createQuery("select distinct o from inspectionrecord$Job o JOIN FETCH o.defectTypeList where o.htJobId = :htJobId",Job.class)
                    .setParameter("htJobId", 154520035)
                    .getResultList();
            tx.commit();
            assertEquals(1, jobs.size());
        } catch(NoResultException e) {
        	return ;
        }
    	
    }
}