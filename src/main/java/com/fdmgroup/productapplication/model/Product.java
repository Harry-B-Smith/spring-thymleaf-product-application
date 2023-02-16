package com.fdmgroup.productapplication.model;

import java.util.Objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Product {
	
	private static int availableId=1;
	private int id;
	private String name;
	private String description;
	private String make;
	private String supplier;
	private double price;

	public Product() {
		id = availableId;
		availableId++;
	}
	
	public Product(String name, String description, String make, String supplier, double price) {
		this();
		this.name = name;
		this.description = description;
		this.make = make;
		this.supplier = supplier;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", make=" + make
				+ ", supplier=" + supplier + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, make, name, price, supplier);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(make, other.make)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(supplier, other.supplier);
	}
	
	
	

}
