package com.intuit.craftdemo.domain.model.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CraftEntityTest {
    private final long id = 123l;
    private final String name = "Test";
    private CraftEntity craftEntity;

    CraftEntityTest() {
        craftEntity = new CraftEntity();

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



}
