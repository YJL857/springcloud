package com.yejinliang.it.controller;

import com.yejinliang.it.entity.basic.Result;
import com.yejinliang.it.vo.PaymentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yejinliang
 * @create 2022-07-08 1:44
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/create")
    public Result create(PaymentVO vo){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", vo, Result.class);
    }

    @GetMapping("/payment/getById/{id}")
    public Result getById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getById/"+id,Result.class);
    }
}
