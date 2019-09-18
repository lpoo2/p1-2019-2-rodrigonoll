package br.edu.ifrs.canoas.lpoo2.p1;

public class Product {
	
	private long id;
	private float unitCost;
	private String name;
	private String description;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
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
	
	
}
