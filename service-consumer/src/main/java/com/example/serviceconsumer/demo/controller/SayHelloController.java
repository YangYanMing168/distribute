package com.example.serviceconsumer.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.serviceapi.service.SayHello;
import org.springframework.stereotype.Component;

@Component
public class SayHelloController {
//    application = "${dubbo.application.id}",
//    registry = "${dubbo.registry.id}"
//    url = "dubbo://localhost:20880"
    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}"
            )
    private SayHello sayHello;

    public String sayHello(String name) {
        return sayHello.sayHello(name);
    }
}
