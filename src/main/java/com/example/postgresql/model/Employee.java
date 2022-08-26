package com.example.postgresql.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String title;
    private String department;
    private double salary;

    public Employee() {
        id = Long.parseLong("0");
        name = title = department = "";
        salary = 0.0;
    }

    public Employee(@JsonProperty("id") Long id,
                    @JsonProperty("name") String name,
                    @JsonProperty("title") String title,
                    @JsonProperty("department") String department,
                    @JsonProperty("salary") double salary) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.department = department;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
