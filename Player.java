package week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	// Fields
	private String name;
	private int score;
	private List<Card> hand = new ArrayList<Card>();
	
	// Constructor
	public Player() {
	}
		
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	// prints out information about the cards
	// that the player has in their hand
	public void describe() {
		System.out.println("Player: " + name + " has these cards in their hand:");
		for (Card card : this.hand) {
			card.describe();
		}
	}
	public void describe2(Card card){
		System.out.print(this.name + " Flips ");
			card.describe();
	}
	
	public void draw(Deck deck) {
		hand.add(deck.drawFromDeck());
	}
	public Card flipCard() {
		return hand.remove(0);
	}
	public void incrementScore() {
		score++;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	}
	