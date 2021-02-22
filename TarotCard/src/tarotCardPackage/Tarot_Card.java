package tarotCardPackage;

public class Tarot_Card {

	public static void main(String[] args) {
		
		Tarot_Menu menu = new Tarot_Menu();
		
		menu.printMainMenu();
		
		Tarot_Deck deck = new Tarot_Deck();

		deck.Shuffle();

		System.out.println("\nYour card to reflect on for today: \n");
		System.out.println(deck.dealJustOne());

	}
	
}


