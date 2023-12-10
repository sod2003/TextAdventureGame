package com.skillstorm.adventure;
import java.util.Scanner;

public class GameRunner {
	private ScenarioHandler sh;
	private BattleHandler bh;
	private Player player;
	private Scanner sc;
	
	public GameRunner() {
		sc = new Scanner(System.in);
		player = CharacterCreation.playerDialogue(sc);
	}
}
