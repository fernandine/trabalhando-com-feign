package com.listCar.list.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.listCar.list.entity.ApiResponse;

@FeignClient(url= "localhost://8081" , name = "api")
public interface ListCarService {
	
	@RequestMapping("/{listCars}")
    ApiResponse getApi(@PathVariable("listCars") String listCars);

}