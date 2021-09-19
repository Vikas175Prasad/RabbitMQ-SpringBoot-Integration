package com.vikas.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.rabbitmq.model.Employee;
import com.vikas.rabbitmq.service.RabbitMQSender;

@RestController
@RequestMapping(value = "/vikas-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName, @RequestParam("empId") Integer empId) {

		Employee emp = new Employee();
		emp.setId(empId);
		emp.setName(empName);
		rabbitMQSender.send(emp);

		return "Message sent to the RabbitMQ Successfully";
	}

}