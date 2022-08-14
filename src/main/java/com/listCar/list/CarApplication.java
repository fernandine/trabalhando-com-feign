package com.listCar.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

}
