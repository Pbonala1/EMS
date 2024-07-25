package com.pravalika.entity;
import jakarta.persistence.*;


@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="department_id")
    private Long departmentId;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;

    public Department() {
    }
    public Department(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Department(Long departmentId, String name, String description) {
        this.departmentId = departmentId;
        this.name = name;
        this.description = description;
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


    public Long getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
