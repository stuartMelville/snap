package com.cardgames;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class CardTest {

	
	@Test
	public void getAPackOfCardsMakeSureThereAre52() {
		int expectedNumberOfCards = 52;
		List<Card> cards = Card.createPack();
		int actualNumberOfCards =cards.size();
		assertEquals(expectedNumberOfCards,actualNumberOfCards);
	}
	
	@Test
	public void printAllCards() {
		List<Card> cards = Card.createPack();
		for(Card card:cards) {
			System.out.println(card.toString());
		}
	}
}
