package com.skillstorm.adventure;
import java.util.Scanner;

public class TestBattleHandler {

	public static void main(String[] args) {
		BattleHandler bh = new BattleHandler();
		Player player = new Player(3, 2, 1, "Barbarian");
		Enemy enemy = new Enemy(2, 1, 1, "Orc", new String[] {"Gold Tooth"});
		Scanner scanner = new Scanner(System.in);
		System.out.println(bh.battle(player, enemy, scanner));

	}

}
