package com.skillstorm.adventure;

public class Player extends Actor {
	private String role;
	private String[] inventory;
	
	public Player(int muscle, int mysticality, int moxie, String role) {
		super(muscle, mysticality, moxie);
		this.role = role;
		this.inventory = new String[] {};
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String[] getInventory() {
		return inventory;
	}

	public void setInventory(String[] inventory) {
		this.inventory = inventory;
	}
	
	public void addInventory(String[] additions) {
		String[] newInventory = 
				new String[inventory.length + additions.length];
		int pivot = inventory.length;
		for (int i = 0; i < pivot; i++) {
			newInventory[i] = inventory[i];
		}
		for (int i = 0; i < additions.length; i++ ) {
			newInventory[pivot + i] = additions[i];
		}
		setInventory(newInventory);
	}
	
	public void removeInventory(String remove) {
		String[] newInventory = new String[inventory.length - 1];
		int itemCount = 0;
		for (String item : inventory) {
			if(!item.equals(remove)) {
				newInventory[itemCount++] = item;
			}
		}
	}
	
}
