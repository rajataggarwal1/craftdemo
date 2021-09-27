package com.intuit.craftdemo.domain.model.entity;

import java.util.List;

public class CraftEntity {

    private long id;
    private String name;
    private List<Employee> employeeList;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }


}
