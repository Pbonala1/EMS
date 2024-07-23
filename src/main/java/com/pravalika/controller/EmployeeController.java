package com.pravalika.controller;

import com.pravalika.dto.EmployeeDto;
import com.pravalika.service.EmployeeService;
import jakarta.persistence.Entity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public  ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable ("id")Long id){
        EmployeeDto employeeDto=employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeDto);
    }
    @GetMapping
    public ResponseEntity<List<EmployeeDto>>getAllEmployees(){
        List<EmployeeDto> employeeDto = employeeService.getAllEmployees();
        return ResponseEntity.ok(employeeDto);
    }
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto>updateEmployee(@PathVariable("id")Long id,@RequestBody EmployeeDto employeeDto){
        EmployeeDto updatedEmployee=employeeService.updateEmployee(id,employeeDto);
        return ResponseEntity.ok(updatedEmployee);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Successfully deleted");
    }


}
