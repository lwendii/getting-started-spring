package com.example.StartSpring.service;

import java.util.List;

import com.example.StartSpring.model.Bike;

public interface IBikeService {

	List<Bike> getAllBikes();

	void save(Bike bike);

}