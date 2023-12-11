package com.skillstorm.adventure;
import java.util.Scanner;

public class CharacterCreation {

	static Player playerDialogue(Scanner sc) {
		Player newPlayer = null;
		System.out.println("Time to create a new character!\n");
		System.out.println("What is your name, hero?");
		String name = nameDialogue(sc);
		newPlayer = roleDialogue(sc, name);
		return newPlayer;
	}

	static String nameDialogue(Scanner sc) {
		String name = "";
		boolean done = false;
		while (!done) {
			System.out.print("Enter name: ");
			name = sc.nextLine();
			System.out.format("\nIs %s correct? (Y or N)\n", name);
			String responseName = sc.nextLine();
			if (clarifyAffirmative(responseName)) {
				System.out.println("Confirmed.");
				done = true;
			} else {
				System.out.println("Try again.\n");
			}
		}
		return name;
	}

	private static Player roleDialogue(Scanner sc, String name) {
		String role = "";
		Player newPlayer = new Player(1, 1, 1, name, "Farmer");
		boolean done = false;
		while (!done) {
			System.out.println("1. Barbarian - All Muscle, little Mysticality,"
					+ " and some Moxie.\n"
					+ "2. Wizard - All Mysticality, some Moxie,"
					+ " and little Mysticality.\n"
					+ "3. Rogue - All Moxie, some Muscle,"
					+ " and little Mysticality.");
			String choice = sc.nextLine();
			switch (choice.charAt(0)) {
			case '1':
				role = "Barbarian";
				newPlayer = new Player(3, 1, 2, name, "Barbarian");
				break;
			case '2':
				role = "Wizard";
				newPlayer = new Player(1, 3, 2, name, "Wizard");
				break;
			case '3':
				role = "Rogue";
				newPlayer = new Player(2, 1, 3, name, "Rogue");
				break;
			default:
				System.out.println("I don't recognize the selection."
						+ " Try again.\n");
				continue;
			}

			System.out.format("\nIs %s correct? (Y or N)\n", role);
			String responseRole = sc.nextLine();

			if (clarifyAffirmative(responseRole)) {
				done = true;
			} else {
				System.out.println("Try again.\n");
			}
		}
		return newPlayer;
	}

	static boolean clarifyAffirmative(String response) {
		if (response.toLowerCase().charAt(0) == 'y') {
			return true;
		}
		return false;
	}
}
