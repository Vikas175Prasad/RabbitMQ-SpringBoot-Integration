package com.vikas.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vikas.rabbitmq", "com.vikas.rabbitmq.config"})
public class RabbitmqProducerConsumerSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerConsumerSpringbootApplication.class, args);
	}

}
