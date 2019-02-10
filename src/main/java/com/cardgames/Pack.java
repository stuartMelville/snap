package com.cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cardgames.Card.CardNumber;
import com.cardgames.Card.CardSuit;

public class Pack {
	private List<Card> pack;
	private Card cardType;

	public Pack(Card cardType) {
		this.cardType = cardType;
	}
	
	public List<Card> createPack() {
		List<Card> cards = new ArrayList<Card>();

		for (CardSuit suit : cardType.CardSuit.values()) {
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
