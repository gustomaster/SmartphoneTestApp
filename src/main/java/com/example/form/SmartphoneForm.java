package com.example.form;

public class SmartphoneForm {
//    @NotNull
    private String name;

    private String maker;

    private String color;

    private Integer price;
    
    private String release;  
    
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

