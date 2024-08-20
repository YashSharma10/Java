package InventorySystem.Entities;

public class Supplie {
	Long id;
	String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Supplie(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}