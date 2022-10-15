package javaproject3rdtry;

public class App {

	public static void main(String[] args) {
			// Instantiate a deck and two players. Call the shuffle method on the deck.
		  
			Deck deck = new Deck(); //creates a new deck 
			deck.shuffle(); //shuffles deck
			Player playerOne = new Player("Leslie");
			Player playerTwo = new Player("Travis");
			
			/*
			*  Using a traditional for loop to iterate 52 times calling the Draw method on the other player
			*  each iteration using the Deck you instantiated.
			*/		
			
			for(int i = 1; i <= 26; i++){ 		
				playerOne.hand.add(deck.draw());
				playerTwo.hand.add(deck.draw());
				}
				   
				playerOne.describe();
				playerTwo.describe();
				   
			//Using a traditional for loop, iterate 26 times and call the flip method for each player.
				
			for (int i = 0; i < 26; i++) {
				 Card playerOneCard = playerOne.flip();  //flips and plays next card for playerOne
				 Card playerTwoCard = playerTwo.flip();  //flips and plays next card for playerTwo
				    if (playerOneCard.getValue() > playerTwoCard.getValue()) {
				      	playerOne.incrementScore();
				    }else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
				      	playerTwo.incrementScore();
				    }else {
				      	System.out.println();
				 }
			}
				   
			// Comparing playerOne and playerTwo scores. Printing out who wins and what score each player has.
			// If there is a draw the word Draw is printed to console.
			if (playerOne.score > playerTwo.score) {
				System.out.println("Leslie " + " Wins!!!");
				System.out.println("With a score of " + playerOne.score + " to " + playerTwo.score);
			} else if (playerTwo.score > playerOne.score) {
				System.out.println("Travis " + " Wins!!!");
				System.out.println("With a score of " + playerTwo.score + " to " + playerOne.score);
		    } else  {
				System.out.println("Draw!!");
		    }
		   
		}
				
	}


