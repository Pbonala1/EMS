package com.pravalika.mapper;

import com.pravalika.dto.DepartmentDto;

import com.pravalika.entity.Department;


public class DepartmentMapper {

    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(
                department.getDepartmentId(),
                department.getName(),
                department.getDescription()

        );
    }
    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getDepartmentId(),
                departmentDto.getName(),
                departmentDto.getDescription()
        );


    }
}

