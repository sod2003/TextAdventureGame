package com.skillstorm.adventure;
import java.util.Scanner;

public class CharacterCreation {

	static Player playerDialogue(Scanner sc) {
		Player newPlayer = null;
		boolean done = false;
		System.out.println("Time to create a new character!");
		while (!done) {
			System.out.println("What is your name, hero?");
			String name = nameDialogue(sc);
			String role = roleDialogue(sc);
			
		}
		return newPlayer;
	}

	static String nameDialogue(Scanner sc) {
		String name = "";
		boolean done = false;
		while (!done) {
			System.out.print("Enter name: ");
			name = sc.nextLine();
			System.out.format("\nIs %s correct?\n", name);
			String responseName = sc.nextLine();
			if (clarifyAffirmative(responseName)) {
				System.out.println("Confirmed.");
				name = responseName;
				done = true;
			} else {
				System.out.println("Try again.");
			}
		}
		return name;
	}

	private static String roleDialogue(Scanner sc) {
		String role = "";
		boolean done = false;
		while (!done) {
			System.out.println("1. Barbarian\n2. Wizard\n3. Rogue");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				role = "Barbarian";
				done= true;
				break;
			case 2:
				role = "Wizard";
				done= true;
				break;
			case 3:
				role = "Rogue";
				done= true;
				break;
			default:
				System.out.println("I don't recognize the selection. Try again.");
			}
		}
		return role;
	}

	static boolean clarifyAffirmative(String response) {
		if (response.toLowerCase().charAt(0) == 'y') {
			return true;
		}
		return false;
	}
}
