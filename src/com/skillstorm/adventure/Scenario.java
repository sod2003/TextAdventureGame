package com.skillstorm.adventure;

public class Scenario {
	private String title;
	private String scene;
	private Enemy[] enemies;
	
	public Scenario(String title, String scene, Enemy[] enemies) {
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

	public Enemy[] getEnemies() {
		return enemies;
	}

	public void setEnemies(Enemy[] enemies) {
		this.enemies = enemies;
	}
	
	
}
