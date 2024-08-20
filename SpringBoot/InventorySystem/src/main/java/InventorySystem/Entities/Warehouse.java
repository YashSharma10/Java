package InventorySystem.Entities;

public class Warehouse {

	long id;
	String name;

	public Warehouse(long id, String name, String email/*,List<Course> courses*/) {
		super();
		this.id = id;
		this.name = name;
		//this.courses = courses;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
