package com.pravalika.service;

import com.pravalika.dto.EmployeeDto;
import com.pravalika.entity.Employee;
import com.pravalika.exception.ResourceNotFoundException;
import com.pravalika.mapper.EmployeeMapper;
import com.pravalika.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee=employeeRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Not exist by id"+id));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees=employeeRepository.findAll();
        return employees.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());

    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployee) {
        Employee employee=employeeRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("not exist by id"+id)
        );
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());
        Employee updatedEmployee1=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployee1);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee1=employeeRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Not exist by id"+id));
        employeeRepository.deleteById(id);
    }
}
