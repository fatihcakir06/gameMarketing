package entities.concretes;

import entities.abstracts.Entity;

public class Employee extends User implements Entity{
		
	private String title;

	
	public Employee() {
		super();
		
	}
	
	public Employee(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
