package com.eking.activemq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
@MapperScan(basePackages = "com.eking.activemq")
@ComponentScan(basePackages = "com.eking.activemq")
public class ActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqApplication.class, args);
	}
}
