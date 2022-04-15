package com.assignment.bean;

public class LandAnimal extends Animal {

	private String inhabitant;

	public LandAnimal(String name, String species, boolean endanger, String inhabitant) {
		super(name, species, endanger);
		this.inhabitant = inhabitant;
	}

	public String getInhabitant() {
		return inhabitant;
	}

	public void setInhabitant(String inhabitant) {
		this.inhabitant = inhabitant;
	}

	public String getDetails() {
		return this.getName() + " " + this.getSpecies();
	}

	@Override
	public String toString() {
		return "LandAnimal [inhabitant=" + inhabitant + ", getName()=" + getName() + ", getSpecies()=" + getSpecies()
				+ ", isEndanger()=" + isEndanger() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
