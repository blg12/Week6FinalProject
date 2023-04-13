package week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Fields
	List<Card> cards = new ArrayList<Card>();
	
	//Constructor
	public Deck() {
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
							"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
		int count = 2;
		// Loop through the suits and numbers arrays to create the deck
		
		
		for (String suit : suits) {
			for (int i = 0; i < numbers.length; i++) {
				Card card = new Card (numbers[i] + " of " + suit, count);
				cards.add(card);
				count++;
			}
			count = 2;
			}
		
		}
	// Getters and Setters
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	// Methods
	// Shuffle randomizes the deck
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	// Draw removes and returns the top card of the Cards Field
	public Card drawFromDeck() {
		return cards.remove(0);
	}
}

