package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "smartphone")
public class Smartphone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	  
	@Column(name="name")
	private String name;
	
	@Column(name="maker")
	private String maker;
	
	@Column(name="color")
	private String color;
	
	@Column(name="price")
	private Integer price;
	 
	@Column(name="release")
	private String release;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	  
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	  
	public void setPrice(Integer price) {
		this.price = price;
	}    
	  
	public String getRelease() {
		return release;
	}
	
	public void setRelease(String release) {
		this.release = release;
	}   
}