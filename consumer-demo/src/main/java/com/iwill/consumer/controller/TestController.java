package com.iwill.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate ;

/*    @Value("${name}")
    private String name ;*/

    @GetMapping("say-hello")
    public String sayHello(){
        String url = "http://provider-demo/test/say-hello";
        String response = restTemplate.getForObject(url,String.class);
        return response ;
    }

    @GetMapping("get-config")
    public String getConfig(){
        return "name" ;
    }
}
