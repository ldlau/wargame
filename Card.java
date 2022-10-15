package javaproject3rdtry;

public class Card {
	//Fields
	private int cardValue;
	public static final int Clubs = 0;
	public static final int Diamonds = 1;
	public static final int Hearts = 2;
	public static final int Spades = 3;
	public static final int Jack = 11;
	public static final int Queen = 12;
	public static final int King = 13;
	public static final int Ace = 14;
	private int cardName;
	
	//Constructor
	public Card(int cardName, int cardValue) {
		this.setCardName(cardName);
		this.setCardValue(cardValue);	
	}
	 
	//Getters and setters. Also throwing exceptions if cards played are out of range.
	 private void setCardName(int newCardName) {
		if (newCardName >= 0 && newCardName <= 3) {
			this.cardName = newCardName;
		} else {
			throw new IllegalArgumentException("Card needs to be between 0 and 3");
	  }
	}
	 
	 private void setCardValue(int newCardValue) {	
		if (newCardValue < 2 || newCardValue > 14) {
			throw new IllegalArgumentException("Card value needs to be between 2 and 14!");
		}
		this.cardValue = newCardValue;
	}
	 
	 public int getcardName() {
		return cardName;
	}
	 
	 public int getValue() {
		return cardValue;
	}
	
	//String toString method - if else statements give the value of each card for comparison during the game			
	public String toString() {
	String card = "";
			if (cardValue == 2) {
				card += "2";
			} else if (cardValue == 3) {
				card += "3";
			} else if (cardValue == 4) {
				card += "4";
			} else if (cardValue == 5) {
				card += "4";
			} else if (cardValue == 6) {
				card += "6";
			} else if (cardValue == 7) {
				card += "7";
			} else if (cardValue == 8) {
				card += "8";
			} else if (cardValue == 9) {
				card += "9";
			} else if (cardValue == 10) {
				card += "10";
			} else if (cardValue == Jack) {
				card += "Jack";
			} else if (cardValue == Queen) {
				card += "Queen";
			} else if (cardValue == King) {
				card += "King";
			} else if (cardValue == Ace) {
				card += "Ace";
			} else {
				card += cardValue;
			}
			
			card += " of ";
			
			if (cardName == Clubs) {
				card += "Clubs";
			} else if (cardName == Diamonds) {
				card += "Diamonds";
			} else if (cardName == Hearts) {
				card += "Hearts";
			} else if (cardName == Spades) {
				card += "Spades";
			}
		return card;
	}
	
	//Print out the information about each card as they are flipped
	public void describe() {
		System.out.println(this.toString() + "\n");
	}
}

