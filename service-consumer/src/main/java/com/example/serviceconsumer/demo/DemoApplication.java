package com.example.serviceconsumer.demo;

import com.example.serviceconsumer.demo.controller.SayHelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		SayHelloController controller = context.getBean(SayHelloController.class);
		System.out.println(controller.sayHello("Ka1m"));
		System.exit(0);
	}

}

