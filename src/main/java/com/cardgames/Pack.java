package com.cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pack {
	private List<StandardCards> pack;
//	private Card cardType;
//
//	public Pack(StandardCards cardType) {
//		this.cardType = cardType;
//	}
	
	public List<StandardCards> createPack() {
		List<Card> cards = new ArrayList<Card>();

		for (CardSuit suit : StandardCards.get) {
			for (CardNumber cNums : CardNumber.values()) {
				Card cd = new Card();
				cd.cardNumber = cNums;
				cd.cardSuit = suit;
				cards.add(cd);
			}
		}
		return cards;
	}

	public List<Card> shuffleCards(List<Card> cards) {
		Collections.shuffle(cards);
		return cards;
	}	
	
}
