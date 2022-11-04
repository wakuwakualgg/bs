package com.qxd.consumer.controller;

import com.qxd.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("consumer")
@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;
    /**方式一：RestTemplate调用
     * @return
     */
    @RequestMapping("getName")
    public String getName(){
        return consumerService.getName();
    }


}
