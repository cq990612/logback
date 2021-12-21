package com.wisenergy.logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/sendMsg/{message}")
    public String sendMsg(@PathVariable("message") String message) {
        log.info("客户端发送消息:{}", message);
        return message;
    }

    @GetMapping("/haha")
    public String haha() {
        log.info("hahahahahahaha");
        return "hahahahahahaha";
    }
}
