package org.ncu.Ecommerce.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;

@Inheritance
@Table(name = "product")
public class PhysicalProduct extends Product{
	@Column(nullable = false)
	int weight;
	@Column(nullable = false)
	int dimensions;
	
	public PhysicalProduct(int id, String name, int price, int weight, int dimensions) {
		super(id, name, price);
		this.weight = weight;
		this.dimensions = dimensions;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDimensions() {
		return dimensions;
	}

	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	
	
	

}
