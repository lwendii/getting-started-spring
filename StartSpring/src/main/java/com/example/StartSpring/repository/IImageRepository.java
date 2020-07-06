package com.example.StartSpring.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.StartSpring.model.Image;

public interface IImageRepository extends CrudRepository<Image, Integer>{

}
