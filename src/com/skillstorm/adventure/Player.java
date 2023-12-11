package com.skillstorm.adventure;
import java.util.ArrayList;

public class Player extends Actor {
	private String name;
	private String role;
	private ArrayList<Treasure> inventory;
	
	public Player(int muscle, int mysticality, int moxie, String name, 
			String role) {
		super(muscle, mysticality, moxie);
		this.name = name;
		this.role = role;
	}

	public Object getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<Treasure> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Treasure> inventory) {
		this.inventory = inventory;
	}
	
	public void addInventory(ArrayList<Treasure> additions) {
		if (additions != null && additions.isEmpty()) {
			for (Treasure treasure : additions) {
				inventory.add(treasure);
			}
		}
	}
	
	public void removeInventory(Treasure remove) {
		if (inventory.contains(remove)) {
			inventory.remove(remove);
		}
	}

	public String toString() {
		return String.format("%s the %s", name, role);
	}
}
