package com.example.StartSpring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "image_data")
	private byte[] imageData;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "image_bike", 
		joinColumns =
			{ @JoinColumn(name = "image_id", referencedColumnName = "id") },
		inverseJoinColumns = 
			{ @JoinColumn(name = "bike_id", referencedColumnName = "id") })
	private Bike bike;
	
	public Image() {
		
	}
	
	public byte[] getImageData() {
		return this.imageData;
	}
	
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	
	public Bike getBike() {
		return this.bike;
	}
	
	public void setBike(Bike bike) {
		this.bike = bike;
	}
}
