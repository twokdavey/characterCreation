package characterCreation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	static ArrayList<Character> characters = new ArrayList<Character>();

	public static void main(String[] args) {
		int index = 0;
		System.out.println("Welcome to the character creator!");
		boolean game = true;
		while (game) {
			System.out.println("Please choose an option.");
			instructions();
			switch (scan.nextInt()) {
			case 1: {
				index+=createCharacter(index);
				break;
			}
			case 2: {
				weaponCheck();
				break;
			}
			case 3: {
				characters();
				break;
			}
			case 4: {
				removeCharacter();
				break;
			}
			}
		}

	}

	public static void instructions() {
		System.out.println("1: Create a character");
		System.out.println("2: Check your weapon");
		System.out.println("3: Who is in your party");
		System.out.println("4: Remove character from party");
	}

	public static int createCharacter(int index) {
		boolean create = true;

		scan.nextLine();
		while (create) {
			String name = "";
			System.out.println("Please state your name!");
			name = scan.nextLine();
			characters.add(new Character(name));
			System.out.println("well hello there " + characters.get(index).getName());
			// equips character
			characters.get(index).weaponTest(ThreadLocalRandom.current().nextInt(1, 8 + 1));
			index++;
			System.out.println("Would you like to create another Character?");
			if (scan.nextLine().equalsIgnoreCase("no")) {
				create = false;
			}
		}
		return index;
	}

	public static void weaponCheck() {

		for (int i = 0; i < characters.size(); i++) {
			System.out.println(characters.get(i).getName());
			System.out.println("Weapon name: " + characters.get(i).weapons.get(0).getWeaponName() + "\nWeapon damage: "
					+ characters.get(i).weapons.get(0).getDamage() + "\nWeapon durability: "
					+ characters.get(i).weapons.get(0).getDurability() + "\n");
		}

	}
	public static void removeCharacter(){
		System.out.println("Type character position you want to remove from your group.");
		for (int i = 0; i < characters.size(); i++) {
			System.out.println(characters.get(i).getName());
		}
		try{
		characters.remove(scan.nextInt()-1);
		}catch(Exception e){
			System.out.println("That is not correct, try again.");
			
		}
	}
	public static void characters(){
		for (int i = 0; i < characters.size(); i++) {
			System.out.println(characters.get(i).getName());
		}
		
	}

}
