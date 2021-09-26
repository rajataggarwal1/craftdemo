package com.intuit.craftdemo.domain.service;

import com.intuit.craftdemo.domain.controller.CraftDemoController;
import com.intuit.craftdemo.domain.model.entity.CraftEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CraftService {
    private static final Logger logger = LoggerFactory.getLogger(CraftService.class);

    public ResponseEntity save(CraftEntity craftEntity) throws Exception{
        return new ResponseEntity("success",HttpStatus.OK);
    }

}
