package com.joao.springbootweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	private int id;
	private String brand;
	private String model;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + "]";
	}

}
