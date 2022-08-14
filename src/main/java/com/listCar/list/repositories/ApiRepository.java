package com.listCar.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listCar.list.entity.ApiResponse;

@Repository
public interface ApiRepository extends JpaRepository<ApiResponse, String> {

}
