package com.skillstorm.adventure;
import java.util.ArrayList;
import java.util.Arrays;

public class ScenarioHandler {
	private ArrayList<Scenario> scenes;

	public ScenarioHandler() {
		generateScenes();
	}

	public ArrayList<Scenario> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<Scenario> scenes) {
		this.scenes = scenes;
	}
	
	public void generateScenes() {
		ArrayList<Scenario> allScenes = getAllScenes();
		
		setScenes(newScenes);
	}

	private ArrayList<Scenario> getAllScenes() {
		ArrayList<Scenario> allScenes = new ArrayList<Scenario>();
		allScenes.add(new Scenario("The Pit", "", generateEnemy("Prisoner")));
		return allScenes;
	}

	private Enemy generateEnemy(String enemy) {
		Enemy newEnemy;
		switch (enemy) {
			case "Prisoner":
				Treasure knife = new Treasure("Knife", 5);
				newEnemy = new Enemy(1, 1, 1, "Prisoner", knife);
			default:
					
		}
				
		return newEnemy;
	}
}
