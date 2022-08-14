package com.listCar.list.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.listCar.list.entity.ApiResponse;
import com.listCar.list.service.ListCarService;

@RestController
@RequestMapping("/api")
public class ListCarController {

	@Autowired
	private ListCarService service;

	 @ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/listCars")
	public ApiResponse getApi(@PathVariable String listCars) {
		return service.getApi(listCars);
	}
}
