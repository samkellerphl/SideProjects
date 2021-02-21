package tarotCardPackage;

public class Tarot_Card {
	
	public static void main(String[] args) {

		Tarot_Deck deck = new Tarot_Deck();

		deck.Shuffle();

		System.out.println("Your card to reflect on for today: ");
		System.out.println(deck.dealJustOne());

	}

}


