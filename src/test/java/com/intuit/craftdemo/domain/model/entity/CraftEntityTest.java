package com.intuit.craftdemo.domain.model.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CraftEntityTest {
    private final long id = 123l;
    private final String name = "Test";
    private List<Employee> employeeList;
    private CraftEntity craftEntity;

    CraftEntityTest() {
        craftEntity = new CraftEntity();
        employeeList = new ArrayList<>();
        employeeList.add(buildEmployee());

    }

    @Test
    public void test_craftEntity_Id() {
        craftEntity.setId(id);
        assertEquals(id, craftEntity.getId());
    }

    @Test
    public void test_craftEntity_Name() {
        craftEntity.setName(name);
        assertEquals(name, craftEntity.getName());
    }

    @Test
    public void test_craftEntity_EmployeeList() {
        craftEntity.setEmployeeList(employeeList);

        List<Employee> expectedList= craftEntity.getEmployeeList();
        Employee expectedEmp=(Employee)expectedList.get(0);

        assertEquals(1, craftEntity.getEmployeeList().size());
        assertEquals(craftEntity.getEmployeeList().get(0).getEmpId(),expectedEmp.getEmpId() );
    }

    private Employee buildEmployee() {
        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setFirstName("f1");
        emp.setLastName("l1");
        emp.setAddress("add");

        return emp;
    }

}
