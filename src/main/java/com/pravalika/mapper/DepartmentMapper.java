package com.pravalika.mapper;

import com.pravalika.dto.DepartmentDto;
import com.pravalika.dto.EmployeeDto;
import com.pravalika.entity.Department;
import com.pravalika.entity.Employee;

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

