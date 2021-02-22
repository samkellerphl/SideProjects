package tarotCardPackage;

import java.util.Scanner;

public class Tarot_Menu {
	
	private final Scanner scanner;

    public Tarot_Menu() {
        scanner = new Scanner(System.in);
    }

    public int printMainMenu() {
        int menuSelection = 0;
        System.out.println("Welcome to your Tarot Card Generator. What brings you here today? ");
        System.out.println("1: Self-Reflection");
        System.out.println("2: Love");
        System.out.println("3: Career");
        System.out.println("0: Exit");
        System.out.print("\nPlease choose an option: ");
        // ensures no InputMisMatchException is thrown
        if (scanner.hasNextInt()) {
            menuSelection = scanner.nextInt();
            scanner.nextLine();
        }
        return menuSelection;
    }
}
