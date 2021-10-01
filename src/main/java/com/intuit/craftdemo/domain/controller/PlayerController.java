package com.intuit.craftdemo.domain.controller;

import com.intuit.craftdemo.domain.model.entity.PlayerEntity;
import com.intuit.craftdemo.domain.model.entity.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import static com.intuit.craftdemo.domain.model.CraftDemoMapping.CRAFT_DEMO_MAPPING;

@RestController
public class PlayerController {
    // Make changes
    private static final Logger logger = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    private PlayerRepository playerRepository;


    @RequestMapping(CRAFT_DEMO_MAPPING+"/{playerID}")
    public PlayerEntity getPlayer(@PathVariable String playerID)
    {
        PlayerEntity playerEntity= new PlayerEntity();
        playerRepository.findById(playerID);
        return playerEntity;
    }

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity save(@RequestBody PlayerEntity playerEntity) throws Exception {
//        ResponseEntity responseEntity = playerRepository.save(playerEntity);
//
//        return responseEntity;
//    }

    @PostMapping(path= "/players", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addPlayer(@RequestBody PlayerEntity playerEntity) throws Exception{

        //add resource
        playerEntity = playerRepository.save(playerEntity);

        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(playerEntity.getPlayerID())
                .toUri();

        //Send location in response
        return ResponseEntity.created(location).build();
    }

}
