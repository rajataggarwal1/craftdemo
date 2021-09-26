package com.intuit.craftdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static com.intuit.craftdemo.domain.model.CraftDemoMapping.CRAFT_DEMO_MAPPING;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponse {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldPassifMatch(){
        assertEquals("Craft Demo", testRestTemplate.getForObject("http://localhost:" + port+ "/" + CRAFT_DEMO_MAPPING, String.class));
    }

}
