package com.example.StartSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.StartSpring.model.Bike;
import com.example.StartSpring.repository.IBikeRepository;

public class BikeService implements IBikeService {

	@Autowired
	private IBikeRepository bikeRepository;
	
	@Override
	public List<Bike> getAllBikes() {
		var bikeList = (List<Bike>) this.bikeRepository.findAll();
		return bikeList;
	}
	
	@Override
	public void save(Bike bike) {
		this.bikeRepository.save(bike);
	}
}
