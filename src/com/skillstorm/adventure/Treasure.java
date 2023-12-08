package com.skillstorm.adventure;

public class Treasure {
	private String name;
	private int value;

	public Treasure(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return String.format("%s worth $%d gold pieces.", name, value);
	}
}
