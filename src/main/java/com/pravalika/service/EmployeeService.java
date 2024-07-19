package com.pravalika.service;

import com.pravalika.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long id);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long id,EmployeeDto updatedEmployee);
    void deleteEmployee(Long id);
}
