package com.example.serviceprovider.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.serviceapi.service.SayHello;
@Service(
        version = "${demo.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class SayHelloImpl implements SayHello {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
