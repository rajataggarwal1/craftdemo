package com.intuit.craftdemo.domain.model.entity;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PlayerDao {

    private Map<String, PlayerEntity> DB = new HashMap<>();

    public PlayerEntity getPlayerById(String playerId) {
        return DB.get(playerId);
    }

    public void addPlayer(PlayerEntity playerEntity) {
        playerEntity.setPlayerID((DB.keySet().size() + Double.toString(Math.random())));
        DB.put(playerEntity.getPlayerID(), playerEntity);
    }

    public void updatePlayer(PlayerEntity playerEntity) {
        DB.put(playerEntity.getPlayerID(), playerEntity);
    }

    public void deletePlayer(String id) {
        DB.remove(id);
    }
}