package org.ncu.Ecommerce.Entity;

import jakarta.persistence.Inheritance;

@Inheritance
public class DigitalProduct extends Product{
	int link;

	public DigitalProduct(int id, String name, int price, int link) {
		super(id, name, price);
		this.link = link;
	}

	public int getLink() {
		return link;
	}

	public void setLink(int link) {
		this.link = link;
	}
	
}
