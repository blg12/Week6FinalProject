package week6FinalProject;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		// Shuffle the deck
		deck.shuffleDeck();
		
		// Add two players
		Player player1 = new Player();
		Player player2 = new Player();
		
		// Set the players names
		player1.setName("Player 1");
		player2.setName("Player 2");
		
		// Create a hand for each player
		player1.setHand(deck.getCards());
		player2.setHand(deck.getCards());
	
		// Deal the cards
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		// Start the round and play the game
		int round = 1;
	
		// Players flip the cards and increment the score
		for (int i = 0; i < 26; i++) {
			System.out.println("\n ---- Round " + round + " of 26 ---- ");
			round++;
			Card cardOne = player1.flipCard();
			Card cardTwo = player2.flipCard();
			player1.describe2(cardOne);
			player2.describe2(cardTwo);
			//cardOne.describe();
			//cardTwo.describe();
		
			
			
		if (cardOne.getValue() > cardTwo.getValue()) {
			player1.incrementScore();
			System.out.println(player1.getName() + " Wins this round! ");
		} else if (cardTwo.getValue() > cardOne.getValue()) {
			player2.incrementScore();
			System.out.println(player2.getName() + " Wins this round! ");
		} else {
			System.out.println("It's a draw! ");
			
		}
		}
		int playerOneScore = player1.getScore();
		int playerTwoScore = player2.getScore();
		
		System.out.println("----------------------------------------------------");
		System.out.println("Player One score: " + playerOneScore);
		System.out.println("Player Two score: " + playerTwoScore);
		
		System.out.println("----------------------------------------------------");
		System.out.println("GAME RESULTS");
		
		if (playerOneScore > playerTwoScore) {
			System.out.println("Player One Wins!");
		} else if 
			(playerTwoScore > playerOneScore) {
			System.out.println("Player Two Wins!");	
		} else if 
			(playerOneScore == playerTwoScore) {
			System.out.println("Draw!");
		}
		}
	
	}
	
		
		
	


