package com.skillstorm.adventure;
//import java.util.Scanner;

public class TestBattleHandler {

	public static void main(String[] args) {
		BattleHandler bh = new BattleHandler();
		Player player = new Player(3, 2, 1, "Bob", "Barbarian");
		Treasure treasure = new Treasure("Gold tooth", 15);
		Enemy enemy = new Enemy(2, 1, 1, "Orc", treasure);
//		Scanner scanner = new Scanner(System.in);
		System.out.println(bh.battle(player, enemy));
	}
}
