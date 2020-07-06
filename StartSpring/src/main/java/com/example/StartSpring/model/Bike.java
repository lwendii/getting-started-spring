package com.example.StartSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bike")
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "userid")
	private Integer userId;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "frame_number")
	private String frameNumber;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "teaser_image_id")
	private Integer teaserImageId;
	
	@OneToOne(mappedBy = "bike")
	private Image image;
	
	public Bike() {
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getFrameNumber() {
		return this.frameNumber;
	}
	
	public void setFrameNumber(String frameNumber) {
		this.frameNumber = frameNumber;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getTeaserImageId() {
		return this.teaserImageId;
	}
	
	public void setTeaserImageId(Integer teaserImageId) {
		this.teaserImageId = teaserImageId;
	}
	
}
