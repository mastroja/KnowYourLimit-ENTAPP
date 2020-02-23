package com.knowyourlimit.dto;

public class DrinkDTO {

	private String type;
	private String name;
	private int size;
	private int drinkID;
	private float abv;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public float getAbv() {
		return abv;
	}
	public void setAbv(float abv) {
		this.abv = abv;
	}
	public int getDrinkID() {
		return drinkID;
	}
	public void setDrinkID(int drinkID) {
		this.drinkID = drinkID;
	}
	
}
