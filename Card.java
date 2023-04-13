package week6FinalProject;

public class Card {
	// Fields
	
	private String nameOfCard;
	private int value;
	
	// Constructor
	public Card(String nameOfCard, int value) {
		this.nameOfCard = nameOfCard;
		this.value = value;
	}
	
	// Getters and Setters
	public String getName() {
		return nameOfCard;
	}

	public void setName(String nameOfCard) {
		this.nameOfCard = nameOfCard;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	// Methods
	public void describe() {
		System.out.println("Card: " + nameOfCard + " with the value of " + value);

	}
}
