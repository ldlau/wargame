package javaproject3rdtry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//field - card(List of Card)
	List<Card> deck = new ArrayList<Card>();
		
	
	//shuffle method from Java Collections makes it easy (:
		public void shuffle() {
			Collections.shuffle(deck);
		}
		
	//playCard method
		public Card playCard() {
			Card playedCard = this.deck.get(0);
			this.deck.remove(0);
			return playedCard;
		}
		
	//Constructor and adding new card to deck
		public Deck() {
			for(int i = 0; i < 4; i++) {
				for(int j = 2; j <= 14; j++) {
					deck.add(new Card(i, j));
		}
	}
}
	//Getter and setter
		public List<Card> getCards(){
			return deck;
		}
		public void setCards(List<Card> deck) {
			this.deck = deck;
		}
		
	//draw method - removes and returns the top card of the Card field.
	//If deck has all been played, prints out "There are no more cards" and returns nothing	
		
		public Card draw() {
			if (deck.isEmpty()) {
				System.out.println("There are no more cards");
				return null;
			}else {
				Card drawnTopCard = deck.get(0);
				deck.remove(0);
				return drawnTopCard;
			}
		}	
	}


