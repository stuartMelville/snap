package com.cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StandardCards implements Comparable<StandardCards> {

	private Map<Integer,String> cardValues = new HashMap<>();
	private List<String> cardSuits = new ArrayList<>();	

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

		cardSuits.add("Clubs");
		cardSuits.add("Diamonds");
		cardSuits.add("Hearts");
		cardSuits.add("Spades");		
		
	}

	private CardNumber cardNumber;
	private CardSuit cardSuit;



	public int compareTo(StandardCards o) {
		if (this.getCardNumber() == o.getCardNumber()) {
			return 0;
		} else if (this.getCardNumber().getValue() > o.getCardNumber().getValue()) {
			return 1;
		} else
			return -1;
	}
	public CardNumber getCardNumber() {
		return cardNumber;
	}

	public CardSuit getCardSuit() {
		return cardSuit;
	}


	public String toString() {
		return cardNumber + " of " + cardSuit;
	}
}
