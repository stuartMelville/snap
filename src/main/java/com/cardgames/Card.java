package com.cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card implements Comparable<Card> {


	public enum CardNumber {
		Two(2), 
		Three(3), 
		Four(4), 
		Five(5), 
		Six(6), 
		Seven(7), 
		Eight(8), 
		Nine(9), 
		Ten(10), 
		Jack(11), 
		Queen(12), 
		King(13),
		Ace(14);

		private int value;

		private CardNumber(int i) {
			this.value = i;
		}

		/**
		 * Returns the value of the enum
		 * 
		 * @return int value of the card
		 */
		public int getValue() {
			return value;
		}
	}

	public enum CardSuit {
		Clubs, 
		Diamonds, 
		Hearts, 
		Spades;
	}

	private CardNumber cardNumber;
	private CardSuit cardSuit;


	public static List<Card> createPack() {
		List<Card> cards = new ArrayList<Card>();

		for (CardSuit suit : CardSuit.values()) {
			for (CardNumber cNums : CardNumber.values()) {
				Card cd = new Card();
				cd.cardNumber = cNums;
				cd.cardSuit = suit;
				cards.add(cd);
			}
		}
		return cards;
	}

	public static List<Card> shuffleCards(List<Card> cards) {
		Collections.shuffle(cards);
		return cards;
	}

	
	public int compareTo(Card o) {
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
