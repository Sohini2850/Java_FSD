package com.assignment.bean;

public class WaterAnimal extends Animal {
	private String inhabitant;

	public WaterAnimal(String name, String species, boolean endanger, String inhabitant) {
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
		return "WaterAnimal [inhabitant=" + inhabitant + ", getName()=" + getName() + ", getSpecies()=" + getSpecies()
				+ ", isEndanger()=" + isEndanger() + ", toString()=" + super.toString() + "]";
	}

}
