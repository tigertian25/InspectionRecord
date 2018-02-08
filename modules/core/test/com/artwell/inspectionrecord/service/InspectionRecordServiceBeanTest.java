package com.artwell.inspectionrecord.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.artwell.inspectionrecord.entity.DefectType;
import com.artwell.inspectionrecord.entity.Employee;

public class InspectionRecordServiceBeanTest extends  InspectionRecordServiceBean {

	@Test
	public void testRecordInspection() {
		List<DefectType> defectTypeList=new ArrayList<DefectType>();
		String result= recordInspection("08014","123456",defectTypeList);
		assertEquals("success", result);
	}
	@Override
	protected void insert(String barcode,Employee employee,List<DefectType> dtList) {
		 
	}
	@Override
	 protected Employee getEmployee(String employeeId) {
		return null;
		
	}
	@Override
	 protected List getDefectTypeList(List<DefectType> defectTypeList) {
		return defectTypeList;
		 
	 }
}
