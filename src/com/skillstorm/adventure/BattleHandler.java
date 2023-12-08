package com.skillstorm.adventure;
import java.util.ArrayList;
import java.util.Scanner;

public class BattleHandler {
	private int battleCount;
	private int enemiesDefeated;
	
	public int getBattleCount() {
		return battleCount;
	}
	
	public void setBattleCount(int battleCount) {
		this.battleCount = battleCount;
	}
	
	public int getEnemiesDefeated() {
		return enemiesDefeated;
	}
	
	public void setEnemiesDefeated(int enemiesDefeated) {
		this.enemiesDefeated = enemiesDefeated;
	}
	
	public boolean battle(Player player, Enemy enemy) {
		battleCount++;
		boolean result = false;
		System.out.format("You square off with the %s.\nRolling attacks...\n",
				enemy.getType());
		if ( player.attack() > enemy.attack()) {
			System.out.format("You defeated the %s!\n", enemy.getType());
			result = true;
			enemiesDefeated++;
			System.out.format("You loot the body of the %s.\n", enemy.getType());
			loot(player, enemy.getTreasure());
		} else {
			System.out.format("The %s defeated you!\nPerhaps it will take more "
					+ "than muscle to defeat this foe.\n", enemy.getType());
		}
		return result;
	}

	private void loot(Player player, ArrayList<Treasure> treasures) {
		for (Treasure treasure : treasures) {
			System.out.println("You gained a " + treasure);
		}
		player.addInventory(treasures);
	}
	
}
