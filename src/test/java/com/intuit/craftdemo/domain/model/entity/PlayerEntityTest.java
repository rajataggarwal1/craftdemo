package com.intuit.craftdemo.domain.model.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerEntityTest {
    private final String playerId = "123";
    private final String playerName = "Test";
    private PlayerEntity playerEntity;

    PlayerEntityTest() {
        playerEntity = new PlayerEntity();

    }

    @Test
    public void test_playerEntity_Id() {
        playerEntity.setPlayerID(playerId);
        assertEquals(playerId, playerEntity.getPlayerID());
    }

    @Test
    public void test_playerEntity_Name() {
        playerEntity.setNameFirst(playerName);
        assertEquals(playerName, playerEntity.getNameFirst());
    }
}
