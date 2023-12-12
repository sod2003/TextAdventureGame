package com.skillstorm.adventure;
import java.util.Scanner;

public class GameRunner {
	private ScenarioHandler sh;
	private BattleHandler bh;
	private Player player;
	private Scanner sc;
	
	public GameRunner() {
		sc = new Scanner(System.in);
		System.out.println("Welcome to Sean's Text Adventure Game!\n");
		player = CharacterCreation.playerDialogue(sc);
		System.out.format("%s has been created!\n", player);
		bh = new BattleHandler();
		sh = new ScenarioHandler();
		sc.close();
	}
	
	public static void main(String[] args) {
		GameRunner game = new GameRunner();
	}
}
