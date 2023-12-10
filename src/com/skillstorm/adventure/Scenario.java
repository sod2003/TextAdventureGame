package com.skillstorm.adventure;
import java.util.ArrayList;

public class Scenario {
	private String title;
	private String scene;
	private ArrayList<Enemy> enemies;
	
	public Scenario(String title, String scene, ArrayList<Enemy> enemies) {
		this.title = title;
		this.scene = scene;
		this.enemies = enemies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getScene() {
		return scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}

	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}

	public void addEnemy(Enemy enemy) {
		enemies.add(enemy);
	}

	public void removeEnemy(Enemy enemy ) {
		enemies.remove(enemy);
	}
}
