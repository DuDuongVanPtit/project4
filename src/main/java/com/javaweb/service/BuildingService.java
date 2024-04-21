package com.javaweb.service;
import com.javaweb.model.dto.AssignmentBuildingDTO;
import com.javaweb.model.dto.BuildingDTO;
import com.javaweb.model.response.ResponseDTO;
import java.util.List;
import java.util.Map;

public interface BuildingService {
    List<BuildingDTO> findAll(Map<String, Object> conditions, List<String> typeCode);
    ResponseDTO save(BuildingDTO buildingDTO);
    BuildingDTO findBuildingById(Long id);
    ResponseDTO deleteBuildings(List<Long> buildingIds);
    ResponseDTO findStaffsByBuildingId(Long buildingId);
    ResponseDTO updateAssignmentTable(AssignmentBuildingDTO assignmentBuildingDTO);
}
