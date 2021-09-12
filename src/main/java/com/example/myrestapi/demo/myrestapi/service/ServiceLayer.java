package com.example.myrestapi.demo.myrestapi.service;

import com.example.myrestapi.demo.myrestapi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class ServiceLayer {

    private final RestTemplate restTemplate;
    @Autowired
    public ServiceLayer(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public User consumeApi(){

        return  restTemplate.getForObject("https://dummy.restapiexample.com/api/v1/employees",User.class);
    }
}
