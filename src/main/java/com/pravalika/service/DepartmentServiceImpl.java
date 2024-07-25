package com.pravalika.service;

import com.pravalika.dto.DepartmentDto;
import com.pravalika.entity.Department;
import com.pravalika.exception.ResourceNotFoundException;
import com.pravalika.mapper.DepartmentMapper;
import com.pravalika.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public DepartmentDto createDepartment(DepartmentDto departmentDto){
        Department department= DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment=departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }
    public DepartmentDto getDepartmentById(Long id){
        Department department=departmentRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("id does not exist"+id));
        return DepartmentMapper.mapToDepartmentDto(department);
    }
    public List<DepartmentDto> getAllDepartments(){
        List<Department> departments=departmentRepository.findAll();
        return departments.stream().map((department) ->
                DepartmentMapper.mapToDepartmentDto(department)).collect(Collectors.toList());
    }
    public DepartmentDto updateDepartment(Long id,DepartmentDto updatedDepartment){
        Department department=departmentRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("id does not exist"+id));
        department.setName(updatedDepartment.getName());
        department.setDescription(updatedDepartment.getDescription());
        Department updatedDepartment1=departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(updatedDepartment1);
    }
    public void deleteDepartment(Long id){
        Department department=departmentRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("id does not exist"+id));
        departmentRepository.deleteById(id);
    }

}
