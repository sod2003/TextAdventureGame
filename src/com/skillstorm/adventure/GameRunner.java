package com.skillstorm.adventure;
import java.util.Scanner;

public class GameRunner {
	private ScenarioHandler sh;
	private BattleHandler bh;
	private Player player;
	private Scanner sc;
	private boolean endGame = false;
	private boolean playerDeath = false;
	
	public GameRunner() {
		sc = new Scanner(System.in);
		System.out.println("Welcome to Sean's Text Adventure Game!\n");
		player = CharacterCreation.playerDialogue(sc);
		System.out.format("%s has been created!\n", player);
		bh = new BattleHandler();
		sh = new ScenarioHandler();
		adventureForth();
		endGame();
		sc.close();
	}

	private void adventureForth() {
		intro();
		beginScene();
		while (!isEndGame()) {
			printScene();
			displayOptions();
			try {
				decision();				
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void intro() {
		System.out.println("\nYou find yourself in the depths of a Dungeon."
				+ " You were taken prisoner by the Dark Sorcer, Germlin,"
				+ " while looking for treasure in the wrong place,"
				+ " at the wrong time.\n");
	}

	public void beginScene() {
		String sceneTitle = sh.currentScene().getTitle();
		if (sceneTitle.equals("The Pit")) {
			System.out.format("Oh no!  You've fallen into %s!\n\n", sceneTitle);
		}
	}

	private void printScene() {
		System.out.println(sh.currentScene());
	}

	private void displayOptions() {
		Enemy enemy = sh.currentScene().getEnemy();
		System.out.println("Your options:");
		System.out.format("1. Fight the %s.", enemy);
		if (player.getMuscle() <= enemy.getMuscle()) {
			System.out.println(" It looks tougher than you.");
		} else {
			System.out.format("[+%d]\n", player.getMuscle() 
					- enemy.getMuscle());
		}
		System.out.format("2. Cast ");
		if (player.getMysticality() <= enemy.getMysticality()) {
			System.out.println("Flare.");
		} else {
			System.out.format("Fireball. [+%d]\n", player.getMysticality() 
					- enemy.getMysticality());			
		}
		System.out.format("3. ");
		if (player.getMoxie() <= enemy.getMoxie()) {
			System.out.println("Ask the "+ enemy 
					+ " nicely if you can walk past them.");
		} else {
			System.out.format("Flash your award-winning smile,"
					+ " and smooze your way out of the situation. [+%d]\n", 
					player.getMoxie() - enemy.getMoxie());			
		}
		System.out.println("What will you do?");
	}

	private void decision() {
		Enemy enemy = sh.currentScene().getEnemy();
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			winConditions(bh.battle(player, enemy));
			break;
		case 2:
			System.out.println("This is where the magic stuff would happen.");
			break;
		case 3:
			System.out.println("This is where the moxie stuff would happen.");			
			break;
		default:
			throw new IllegalArgumentException("Not a valid choice!"
					+ " Try again.\n");
		}
	}

	private void winConditions(boolean battle) {
		Scenario scene = sh.currentScene();
		if (battle) {
			sh.currentScene().removeEnemy();
			if (sh.lastScene()) {
				endGame = true;
			} else {
				sh.advanceScene();
			}
		} else {
			endGame = playerDeath = true;
		}
	}

	private void endGame() {
		if (isPlayerDead()) {
			System.out.format("\nYou Died\n\n%s has been lost to the forces "
					+ "of darkness!\n\n", player);
		} else {
			System.out.format("\nYou won!\n\nThe name of %s will be remembered "
					+ "through the ages!\n\n", player);			
		}
		System.out.println("End Game reached. Thanks for playing!");
	}

	private boolean isEndGame() {
		return endGame;
	}

	private boolean isPlayerDead() {
		return playerDeath;
	}

	public static void main(String[] args) {
		GameRunner game = new GameRunner();
	}
}
