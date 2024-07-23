package com.pravalika.service;

import com.pravalika.dto.DepartmentDto;


import java.util.List;

public interface DepartmentService {

    DepartmentDto createDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentById(Long id);
    List<DepartmentDto> getAllDepartments();
    DepartmentDto updateDepartment(Long id,DepartmentDto updatedDepartment);
    void deleteDepartment(Long id);
}
