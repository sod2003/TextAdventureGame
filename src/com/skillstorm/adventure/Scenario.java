package com.skillstorm.adventure;

public class Scenario {
	private String title;
	private String scene;
	private Enemy enemy;
	
	public Scenario(String title, String scene, Enemy enemy) {
		this.title = title;
		this.scene = scene;
		this.enemy = enemy;
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

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

	public void removeEnemy() {
		enemy = null;
	}

	public String toString() {
		String str = String.format("%s\n~~~~~~~~~~\n%s", title, scene);
		if (enemy != null) {
			str += "\nA " + enemy + " is blocking the way out.\n";
		}
		return str;
	}
}
