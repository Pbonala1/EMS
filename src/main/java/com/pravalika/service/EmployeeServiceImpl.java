package com.pravalika.service;

import com.pravalika.dto.EmployeeDto;
import com.pravalika.entity.Employee;
import com.pravalika.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee=
        return null;
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        return null;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return List.of();
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
