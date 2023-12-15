package com.skillstorm.adventure;
import java.util.ArrayList;
import java.util.Arrays;

public class ScenarioHandler {
	private ArrayList<Scenario> scenes;
	private int currentScene;

	public ScenarioHandler() {
		generateScenes();
		currentScene = 0;
	}

	public ArrayList<Scenario> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<Scenario> scenes) {
		this.scenes = scenes;
	}

	public void generateScenes() {
		ArrayList<Scenario> allScenes = new ArrayList<Scenario>();
		allScenes.add(new Scenario("The Dungeon", "After days of torture, the "
				+ "dark sorcerer has left you alone in the Dungeon with a single "
				+ "guard.", generateEnemy(0)));
		if (surpriseScene()) {
			allScenes.add(new Scenario("The Pit", "You're in a dark pit."
					+ " A faint light glows above, from where you've fallen.",
					generateEnemy(1)));
		}
		allScenes.add(new Scenario("The Gates of Doom", "You found the entrance"
				+ " hall of the dungeon.\nBeyond the gates lies the way out,"
				+ " and your salvation.",
				generateEnemy(2)));
		if (surpriseScene()) {
			allScenes.add(new Scenario("The Lair of the Dragon", 
					"You've escaped the dungeon, but now you're in the lair of "
							+ "the Dragon!", generateEnemy(3)));
		}
		allScenes.add(new Scenario("The Dark Temple", 
				"You've found your way back to the Dark Temple, "
						+ "where Germlin first took you prisoner.",
						generateEnemy(4)));
		setScenes(allScenes);
	}

	private boolean surpriseScene() {
		return (int)(Math.random() * 2) == 1;
	}

	public Scenario currentScene() {
		return scenes.get(currentScene);
	}

	public void advanceScene() {
		currentScene++;
	}

	public boolean lastScene() {
		return currentScene == scenes.size() - 1;
	}

	private Enemy generateEnemy(int enemy) {
		Enemy newEnemy = null;
		switch (enemy) {
		case 0:
			Treasure knife = new Treasure("Knife", 5);
			newEnemy = new Enemy(1, 1, 1, "Goblin", knife);
			break;
		case 1:
			Treasure manBearPigHeart =
			new Treasure("Heart of the ManBearPig", 500);
			newEnemy = new Enemy(2, 2, 1, "ManBearPig", manBearPigHeart);
			break;
		case 2:
			Treasure axe = new Treasure("Axe", 15);
			newEnemy = new Enemy(2, 1, 1, "Orc", axe);
			break;
		case 3:
			Treasure egg = new Treasure("Dragon's Egg", 1000);
			newEnemy = new Enemy(3, 2, 1, "Dragon", egg);
			break;
		case 4:
			Treasure stone = new Treasure("Sorcerer's Stone", 1000);
			newEnemy = new Enemy(1, 3, 3, "Evil Sorcerer, Germlin",
					stone);				
			break;
		default:
			throw new IllegalArgumentException("You weren't "
					+ "supposed to create this enemy.");
		}
		return newEnemy;
	}
}
