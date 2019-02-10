package com.cardgames;

import java.util.HashMap;
import java.util.Map;

public class StandardCards implements Comparable<StandardCards> {

	public static final Map<Integer,String> cardValues = new HashMap<>();
	public  static final Map<Integer,String> cardSuits = new HashMap<>();	

	public StandardCards() {
		cardValues.put(2, "Two");
		cardValues.put(3, "Three");		
		cardValues.put(4, "Four");		
		cardValues.put(5, "Five");		
		cardValues.put(6, "Six");		
		cardValues.put(7, "Seven");		
		cardValues.put(8, "Eight");		
		cardValues.put(9, "Nine");		
		cardValues.put(10, "Ten");		
		cardValues.put(11, "Jack");		
		cardValues.put(12, "Queen");		
		cardValues.put(13, "King");		
		cardValues.put(14, "Ace");		

		cardSuits.put(1,"Clubs");
		cardSuits.put(2,"Diamonds");
		cardSuits.put(3,"Hearts");
		cardSuits.put(4,"Spades");		
		
	}

	private int cardNumber;
	private int cardSuit;



	public int compareTo(StandardCards o) {
		if (this.getCardNumber() == o.getCardNumber()) {
			return 0;
		} else if (this.getCardNumber() > o.getCardNumber()) {
			return 1;
		} else
			return -1;
	}
	public int getCardNumber() {
		return cardNumber;
	}

	public int getCardSuit() {
		return cardSuit;
	}


	public String toString() {
		return cardValues.get(cardNumber) + " of " + cardSuits.get(cardSuit);
	}
}
