package com.vikas.rabbitmq.components;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.vikas.rabbitmq.model.Employee;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${vikas.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}
