package com.skillstorm.adventure;
import java.util.ArrayList;

public class Enemy extends Actor {
	private String type;
	private ArrayList<Treasure> treasure = new ArrayList<Treasure>();

	public Enemy(int muscle, int mysticality, int moxie, String type, 
			ArrayList<Treasure> treasure) {
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

	public ArrayList<Treasure> getTreasure() {
		return treasure;
	}

	public void setTreasure(ArrayList<Treasure> treasure) {
		this.treasure = treasure;
	}

	public String toString() {
		return String.format("%s", type);
	}
}
