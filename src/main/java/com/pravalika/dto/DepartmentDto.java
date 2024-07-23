package com.pravalika.dto;



public class DepartmentDto {
    private Long departmentId;
    private String name;
    private String description;

    public DepartmentDto(Long departmentId, String name, String description) {
        this.departmentId = departmentId;
        this.name = name;
        this.description = description;
    }

    public DepartmentDto(Long departmentId) {
        this.departmentId = departmentId;
    }

    public DepartmentDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public DepartmentDto() {
    }
    public Long getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
