package com.example.StartSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.StartSpring.model.Image;
import com.example.StartSpring.repository.IImageRepository;

public class ImageService {
	
	@Autowired
	private IImageRepository imageRepository;
	
	public List<Image> getAllImage() {
		var imageList = (List<Image>) this.imageRepository.findAll();
		return imageList;
	}

	public void save(Image image) {
		this.imageRepository.save(image);
	}
}
