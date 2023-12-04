package com.skillstorm.adventure;
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
	
	public String battle(Player player, Enemy enemy, Scanner scanner) {
		battleCount++;
		String result = "";
		System.out.format("You square off with the %s.\nRolling attacks...\n",
				enemy.getType());
		double playerAttack = (Math.random() + 1) * player.getMuscle();
		double enemyAttack = (Math.random() + 1) * enemy.getMuscle();
		if ( playerAttack > enemyAttack) {
			System.out.format("You defeated the %s!\n", enemy.getType());
			result = "success";
		} else {
			System.out.format("The %s defeated you!\n", enemy.getType());
			result = "defeat";
		}
		return result;
	}
	
}
