package main;

import java.util.Scanner;

public class Main {

	Scanner myScan = new Scanner(System.in);
	
	static String yourRace;
	static String yourClass;
	static String yourName;
	static String throwawayline;
	
	public void DnDrace() { 
		String strRace[] = {"Dragonborn", "Dwarf", "Elf", "Gnome",
				"Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling"
				};
		
		System.out.println("Please enter a number to select "
					+ "your character's race.");
		System.out.println("1: " + strRace[0]);
		System.out.println("2: " + strRace[1]);
		System.out.println("3: " + strRace[2]);
		System.out.println("4: " + strRace[3]);
		System.out.println("5: " + strRace[4]);
		System.out.println("6: " + strRace[5]);
		System.out.println("7: " + strRace[6]);
		System.out.println("8: " + strRace[7]);
		System.out.println("9: " + strRace[8]);
		
		int i = myScan.nextInt();
		yourRace = strRace[i - 1];
		System.out.println("Your character's race is " + yourRace + ".");
	}	
	
	public void DnDclass() {
		String strClass[] = {"Artificer", "Barbarian", "Bard", "Cleric",
				"Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue",
				"Sorcerer", "Warlock", "Wizard"
				};
		System.out.println("Please enter a number to select "
					+ "your character's class.");
		System.out.println("1: " + strClass[0]);
		System.out.println("2: " + strClass[1]);
		System.out.println("3: " + strClass[2]);
		System.out.println("4: " + strClass[3]);
		System.out.println("5: " + strClass[4]);
		System.out.println("6: " + strClass[5]);
		System.out.println("7: " + strClass[6]);
		System.out.println("8: " + strClass[7]);
		System.out.println("9: " + strClass[8]);
		System.out.println("10: " + strClass[9]);
		System.out.println("11: " + strClass[10]);
		System.out.println("12: " + strClass[11]);
		System.out.println("13: " + strClass[12]);

		int j = myScan.nextInt();
		yourClass = strClass[j - 1];
		System.out.println(""); // extra line
		System.out.println("Your character's class is " + yourClass + ".");
		
	}
	
	public void DnDname() {
		System.out.println("Please enter your character's name.");
		throwawayline = myScan.nextLine();
		yourName = myScan.nextLine();
		System.out.println("Your character's name is " + yourName + ".");

	}
	
	public static void main(String args[]) {	
		Main newCharacter = new Main();
		
		newCharacter.DnDrace();
		newCharacter.DnDclass();
		newCharacter.DnDname();
		
		System.out.println(""); //empty line
		System.out.println("Congratulations on making your new character!");
		System.out.println("Race: " + yourRace);
		System.out.println("Class: " + yourClass);
		System.out.println("Name: " + yourName);
		
	}
}
