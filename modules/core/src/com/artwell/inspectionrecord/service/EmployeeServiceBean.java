package com.artwell.inspectionrecord.service;

import com.artwell.inspectionrecord.entity.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.persistence.NoResultException;

@Service(EmployeeService.NAME)
public class EmployeeServiceBean implements EmployeeService {
	Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
	private Logger log = LoggerFactory.getLogger(EmployeeServiceBean.class);
    @Inject
    private Persistence persistence;

   
    
    @Override
    public LoginInfo getLoginInfobyCode(String code) {
    	HtEmpl htEmpl = null;
    	Employee employee = null;
    	HtJob htJob = null;
    	Job job = null;
    	
        System.out.println(code);
        
        htEmpl=getHtEmpl(code);
        employee=getEmployee(htEmpl);
        htJob=getHtJob(htEmpl);
        job=getJob(htEmpl);
        
    	if(null!=htEmpl&&null!=employee&&null!=htJob&&null!=job) {
    		LoginInfo loginInfo=new LoginInfo(htEmpl.getXName(), employee.getId(), employee.getHtEmplId(), htJob.getXName(), job.getId(), job.getHtJobId(), job.getDefectTypeList());
    		log.debug(loginInfo.toString());
    		return loginInfo;
    	}else {
    		return null;
    	}
    }
    
    protected HtEmpl getHtEmpl(String code) {
    	try (Transaction tx = persistence.createTransaction("legacy")) {
            EntityManager em = persistence.getEntityManager("legacy");
            HtEmpl htEmpl = (HtEmpl) em.createQuery("select h from inspectionrecord$HtEmpl h where h.xNo = :code")
                    .setParameter("code", code)
                    .getSingleResult();
            tx.commit();
            return htEmpl;
        } catch(NoResultException e) {
            return null;
        }
    }
    protected Employee getEmployee(HtEmpl htEmpl) {
    	try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            Employee employee = (Employee) em.createQuery("select o from inspectionrecord$Employee o where o.htEmplId = :htEmplId")
                    .setParameter("htEmplId", htEmpl.getId())
                    .getSingleResult();
            tx.commit();
            return employee;
        } catch(NoResultException e) {
        	
            return null;
        }
    }
    protected HtJob getHtJob(HtEmpl htEmpl) {
    	try (Transaction tx = persistence.createTransaction("legacy")) {
            EntityManager em = persistence.getEntityManager("legacy");
            HtJob htJob = (HtJob) em.createQuery("select h from inspectionrecord$HtJob h where h.id = :htJobId")
                    .setParameter("htJobId", htEmpl.getRJob())
                    .getSingleResult();
            tx.commit();
            return htJob;
        } catch(NoResultException e) {
            return null;
        }
    }
    protected Job getJob(HtEmpl htEmpl) {
    	try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            Job job = (Job) em.createQuery("select distinct o from inspectionrecord$Job o JOIN FETCH o.defectTypeList where o.htJobId = :htJobId")
                    .setParameter("htJobId", htEmpl.getRJob())
                    .getSingleResult();
            tx.commit();
            return job;
        } catch(NoResultException e) {
        	return null;
        }
    }
}