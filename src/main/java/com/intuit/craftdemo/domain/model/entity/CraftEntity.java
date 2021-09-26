package com.intuit.craftdemo.domain.model.entity;

import java.util.List;

import static com.intuit.craftdemo.domain.model.CraftDemoMapping.CRAFT_DEMO_API_TYPE;

public class CraftEntity {

    private long id;
    private String name;
    private List<Employee> employeeList;

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
