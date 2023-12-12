package com.skillstorm.adventure;

public class Enemy extends Actor {
	private String type;
	private Treasure treasure;

	public Enemy(int muscle, int mysticality, int moxie, String type,
			Treasure treasure) {
		super(muscle, mysticality, moxie);
		this.type = type;
		this.treasure = treasure;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public void setTreasure(Treasure treasure) {
		this.treasure = treasure;
	}

	public String toString() {
		return String.format("%s", type);
	}
}
