package com.skillstorm.adventure;

public class Enemy extends Actor {
	private String type;
	private String treasure;

	public Enemy(int muscle, int mysticality, int moxie, String type, String treasure) {
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

	public String getTreasure() {
		return treasure;
	}

	public void setTreasure(String treasure) {
		this.treasure = treasure;
	}
	
}
