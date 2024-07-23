package com.pravalika.dto;

public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public EmployeeDto(Long id) {
        this.id = id;
    }

    public EmployeeDto(String firstName, String lastName, String email, Long departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.departmentId = departmentId;
    }

    public EmployeeDto(Long id, String firstName, String lastName, String email, Long departmentId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.departmentId = departmentId;
    }
    public EmployeeDto() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }








}
