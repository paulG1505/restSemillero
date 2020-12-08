package com.clearminds.entidades;

public class Persona {
	private String name,lastName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Persona(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}
	public Persona() {
		
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", lastName=" + lastName + "]";
	}
	
	
}
