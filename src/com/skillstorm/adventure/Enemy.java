package com.skillstorm.adventure;

public class Enemy extends Actor {
	private String treasure;

	public Enemy(int muscle, int mysticality, int moxie, String treasure) {
		super(muscle, mysticality, moxie);
		this.treasure = treasure;
	}

	public String getTreasure() {
		return treasure;
	}

	public void setTreasure(String treasure) {
		this.treasure = treasure;
	}
	
}
