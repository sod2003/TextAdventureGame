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
		beginAdventure();
		endGame();
		sc.close();
	}

	private void beginAdventure() {
		beginScene();
		printScene();
		displayOptions();
	}

	public void beginScene() {
		String sceneTitle = sh.currentScene().getTitle();
		if (sceneTitle.equals("The Pit")) {
			System.out.format("Oh no!  You've fallen into %s!\n", sceneTitle);
		}
	}

	private void printScene() {
		System.out.println(sh.currentScene());
	}

	private void displayOptions() {
		System.out.format("1. Fight the %s.", sh.currentScene().getEnemy());
		if (player.getMuscle() <= sh.currentScene().getEnemy().getMuscle()) {
			System.out.println(" It looks tougher than you.");
		} else {
			System.out.println("[+"+(player.getMuscle()-sh.currentScene().getEnemy().getMuscle())+"]");			
		}
		System.out.format("2. Cast ");
		if (player.getMysticality() <= sh.currentScene().getEnemy().getMysticality()) {
			System.out.println("Flare.");
		} else {
			System.out.println("Fireball.");			
		}
		System.out.format("3. ");
		if (player.getMoxie() <= sh.currentScene().getEnemy().getMoxie()) {
			System.out.println("Ask the "+ sh.currentScene().getEnemy() 
					+ " nicely if you can walk past them.");
		} else {
			System.out.println("Flash your award-winning smile,"
					+ " and smooze your way out of the situation.");			
		}
		System.out.println("What will you do?");
	}

	private void endGame() {
		System.out.println("End Game reached");
	}

	public static void main(String[] args) {
		GameRunner game = new GameRunner();
	}
}
