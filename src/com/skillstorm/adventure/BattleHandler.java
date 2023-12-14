package com.skillstorm.adventure;

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
				enemy);
		if ( player.attack() > enemy.attack()) {
			System.out.format("You defeated the %s!\n", enemy);
			result = true;
			enemiesDefeated++;
			System.out.format("You loot the body of the %s.\n", enemy);
			loot(player, enemy.getTreasure());
		} else {
			System.out.format("The %s defeated you!\nPerhaps it will take more "
					+ "than muscle to defeat this foe.\n", enemy);
		}
		return result;
	}

	public boolean cast(Player player, Enemy enemy) {
		boolean result = false;
		if ( player.magic() > enemy.magic()) {
			System.out.format("You incinerated the %s!\n", enemy);
			result = true;
			battleCount++;
			enemiesDefeated++;
			System.out.format("You loot the body of the %s.\n", enemy);
			loot(player, enemy.getTreasure());
		} else {
			System.out.format("You blind the %s with your magic flare. "
					+ "They suffer a disadvantage now that they are blinded.\n",
					enemy);
			enemy.setMuscle(enemy.getMuscle() - 1);
		}
		return result;
	}

	public boolean smooze(Player player, Enemy enemy) {
		boolean result = false;
		if ( player.moxie() > enemy.moxie()) {
			System.out.format("The %s smiles at you, blushing.\n"
					+ "They willingly give you their treasure and let you pass."
					+ "\n", enemy);
			result = true;
			battleCount++;
			enemiesDefeated++;
			loot(player, enemy.getTreasure());
		} else {
			System.out.format("The %s is not amused.\n", enemy);
		}
		return result;
	}

	private void loot(Player player, Treasure treasure) {
		if (treasure != null) {
			System.out.println("You gained a " + treasure + "\n");
		}
		player.addInventory(treasure);
	}
}
