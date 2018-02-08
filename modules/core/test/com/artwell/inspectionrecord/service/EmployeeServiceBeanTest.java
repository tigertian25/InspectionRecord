package com.artwell.inspectionrecord.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.artwell.inspectionrecord.entity.DefectType;
import com.artwell.inspectionrecord.entity.Employee;
import com.artwell.inspectionrecord.entity.HtEmpl;
import com.artwell.inspectionrecord.entity.HtJob;
import com.artwell.inspectionrecord.entity.Job;
import com.haulmont.cuba.core.global.UuidProvider;

public class EmployeeServiceBeanTest extends EmployeeServiceBean {

	UUID uidEmployee = UuidProvider.createUuid();
	UUID uidJob = UuidProvider.createUuid();

	@Test
	public void testGetLoginInfobyCode() {
		LoginInfo loginInfo=getLoginInfobyCode("08014");
		assertEquals(uidEmployee, loginInfo.employeeId);

	}

	@Override
	public HtEmpl getHtEmpl(String code) {
		HtEmpl htEmpl = new HtEmpl();
		htEmpl.setXName("htEmpl_XName");
		return htEmpl;
	}

	@Override
	public Employee getEmployee(HtEmpl htEmpl) {
		Employee employee = new Employee();
		employee.setId(uidEmployee);
		employee.setHtEmplId(1);
		return employee;
	}

	@Override
	public HtJob getHtJob(HtEmpl htEmpl) {
		HtJob htJob = new HtJob();
		htJob.setXName("htJob_XName");
		return htJob;
	}
	@Override
	 public Job getJob(HtEmpl htEmpl) {
		Job job=new Job();
		job.setId(uidJob);
		job.setHtJobId(2);
		List<DefectType> DefectTypeList=new ArrayList<DefectType>();
		DefectType defectType =new DefectType();
		defectType.setName("ÆÆ¶´");
		DefectTypeList.add(defectType);
		job.setDefectTypeList(DefectTypeList);
		return job;
	}

}
