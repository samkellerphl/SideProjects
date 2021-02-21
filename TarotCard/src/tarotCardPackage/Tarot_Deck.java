package tarotCardPackage;

import java.util.ArrayList;
import java.util.Collections;



public class Tarot_Deck {

	private String[] suits = new String[] { "Wands", "Cups", "Swords", "Pentacles" };
	private String[] ranks = new String[] { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
											"Eight", "Nine", "Ten", "Page", "Knight", "Queen", "King" };
	private String[] majorArcana = new String[] { "The Fool", "The Magician", "The High Priestess", 
												"The Empress", "The Emperor", "The Hierophant", "The Lovers", 
												"The Chariot", "Strength", "The Hermit", "Wheel of Fortune",
												"Justice", "The Hanged Man", "Death", "Temperance", "The Devil",
												"The Tower", "The Star", "The Moon", "The Sun",
												"Judgment", "The World"};


	ArrayList<String> tarot_deck = new ArrayList<>();


	public Tarot_Deck() {
		
		getNewDeck();
		
	}


	public void getNewDeck() {
		
		for (String suit : suits) {
			for (String rank : ranks) {
				tarot_deck.add("The " + rank + " of " + suit);
			}
		}
		
		for (String major : majorArcana) {
			tarot_deck.add(major);
		}
		
	}


	public String dealJustOne() {

		if (tarot_deck.size() != 0) {
			return tarot_deck.remove(0);
		} else {
			return null;
		}
	}


	public void Shuffle() {

		Collections.shuffle(tarot_deck);

	}

}


	
	
	

