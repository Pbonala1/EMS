package com.pravalika.mapper;

import com.pravalika.dto.EmployeeDto;
import com.pravalika.entity.Department;
import com.pravalika.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartment() != null ? employee.getDepartment().getDepartmentId() : null
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());

        if (employeeDto.getDepartmentId() != null) {
            Department department = new Department();
            department.setDepartmentId(employeeDto.getDepartmentId());
            employee.setDepartment(department);
        }

        return employee;
    }
}
