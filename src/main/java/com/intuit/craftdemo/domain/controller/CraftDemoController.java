package com.intuit.craftdemo.domain.controller;

import com.intuit.craftdemo.domain.model.entity.CraftEntity;
import com.intuit.craftdemo.domain.service.CraftService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.intuit.craftdemo.domain.model.CraftDemoMapping.CRAFT_DEMO_MAPPING;

@RestController
@RequestMapping(CRAFT_DEMO_MAPPING)
//@RequestMapping
public class CraftDemoController {
    // Make changes
    private static final Logger logger = LoggerFactory.getLogger(CraftDemoController.class);

    @Autowired
    private CraftService craftService;

    @GetMapping()
    public String getCraft()
    {
        return "Craft Demo";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@RequestBody CraftEntity carftEntity) throws Exception {
        ResponseEntity responseEntity = craftService.save(carftEntity);

        return responseEntity;
    }

}
