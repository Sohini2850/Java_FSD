package com.assignment.bean;

public class Animal {
	private String name;
	private String species;
	private boolean endanger;

	public Animal(String name, String species, boolean endanger) {
		this.name = name;
		this.species = species;
		this.endanger = endanger;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isEndanger() {
		return endanger;
	}

	public void setEndanger(boolean endanger) {
		this.endanger = endanger;
	}

	public String getDetails() {
		return this.name + " " + this.species;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", endanger=" + endanger + "]";
	}

}
