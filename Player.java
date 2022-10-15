package javaproject3rdtry;

import java.util.ArrayList;
import java.util.List;

public class Player {
//	Fields
// 	1. hand (List of Card)
// 	2. score (set to 0 in the constructor)
// 	3. name
	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
//Constructor
	public Player(String name) {
		this.score = 0;
		this.name = name;
		}
		
// 	Print out information about the player and call the describe
//	method for each card in the Hand List
		
	public void describe() {
		System.out.println(name + score + "points!\n");
		for (Card card : hand) {
			card.describe();
		}
		System.out.println("**********************************");
		}
		
//Flip method removes and returns the top card of the Hand
			
	public Card flip() {
		Card drawnTopCard = hand.get(0);
		hand.remove(0);
		return drawnTopCard;
	}
	
//Take a Deck as an argument and call the draw method on the deck,
//adding the returned Card to the hand field
	
	public void draw (Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
//incrementScore method adds 1 to the score field
	public void incrementScore() {
		this.score++;
	}	
	
}

