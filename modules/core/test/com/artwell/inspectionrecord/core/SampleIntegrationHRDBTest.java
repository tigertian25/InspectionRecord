package com.artwell.inspectionrecord.core;

import com.artwell.inspectionrecord.InspectionrecordTestContainer;
import com.artwell.inspectionrecord.InspectionrecordTestContainerHRDB;
import com.artwell.inspectionrecord.entity.HtEmpl;
import com.artwell.inspectionrecord.entity.HtJob;
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

public class SampleIntegrationHRDBTest {

    @ClassRule
    public static InspectionrecordTestContainerHRDB cont = InspectionrecordTestContainerHRDB.Common.INSTANCE;

    private Metadata metadata;
    private Persistence persistence;
    private DataManager dataManager;

    @Before
    public void setUp() throws Exception {
        metadata = cont.metadata();
        persistence = cont.persistence();
        dataManager = AppBeans.get(DataManager.class);
    }

   
    @Test
    public void getHtEmpl() {
    	String code="08014";
    	try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            List<HtEmpl> htEmpl =  em.createQuery("select h from inspectionrecord$HtEmpl h where h.xNo = :code",HtEmpl.class)
                    .setParameter("code", code)
                    .getResultList();
            tx.commit();
            assertEquals(1, htEmpl.size());
        } catch(NoResultException e) {
            return ;
        }
    }
    @Test
    public void getHtJob() {
    	try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            List<HtJob> htJobs =  em.createQuery("select h from inspectionrecord$HtJob h where h.id = :htJobId",HtJob.class)
                    .setParameter("htJobId", 154520035)
                    .getResultList();
            tx.commit();
            assertEquals(1, htJobs.size());
        } catch(NoResultException e) {
            return ;
        }
    }
}