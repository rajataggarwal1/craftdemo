package com.intuit.craftdemo.domain.service;

import com.intuit.craftdemo.domain.model.entity.PlayerDao;
import com.intuit.craftdemo.domain.model.entity.PlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private static final Logger logger = LoggerFactory.getLogger(PlayerService.class);

    @Autowired
    private PlayerDao playerDao;

    public PlayerEntity getPlayerById(String id) {
        return playerDao.getPlayerById(id);
    }


    public void save(PlayerEntity playerEntity) throws Exception{
        playerDao.addPlayer(playerEntity);
    }

}
