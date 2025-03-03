package com.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shelf{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shelfID;
    
    private String location;
    private String category;
    private int capacity;
	public int getShelfID() {
		return shelfID;
	}
	public void setShelfID(int shelfID) {
		this.shelfID = shelfID;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


}
