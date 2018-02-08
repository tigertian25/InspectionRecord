package com.artwell.inspectionrecord.service;



import java.util.List;

import com.artwell.inspectionrecord.entity.DefectType;

public interface InspectionRecordService {
    String NAME = "inspectionrecord_InspectionRecordService";

     public String recordInspection(String employeeId, String barcode, List<DefectType> defectTypeList );

}