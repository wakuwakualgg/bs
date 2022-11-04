package com.qxd.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    public String getName() {
        //调用子模块接口地址
        String name = restTemplate.getForObject("http://service-provider/test/getName", String.class);
        return name;
    }

}
