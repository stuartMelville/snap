package com.cardgames;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cardgames.SnapGame.MatchType;

public class SnapGameTest {
	

	@Test
   public void makeSureTheDeckIsPopulatedOnePack() {
		int expectedNumberOfCards = 52;
		SnapGame game = new SnapGame(1,MatchType.EXACT);
		game.dealTheCards();
		int actualNumberOfCards = game.getDeck().size();
		assertEquals(expectedNumberOfCards,actualNumberOfCards);
		
    }
	@Test
	   public void makeSureTheDeckIsPopulatedTenPacks() {
			int expectedNumberOfCards = 520;
			SnapGame game = new SnapGame(10,MatchType.EXACT);
			game.dealTheCards();
			int actualNumberOfCards = game.getDeck().size();
			assertEquals(expectedNumberOfCards,actualNumberOfCards);
			
	    }	
	@Test
	   public void makeSureTheDeckIsDealtEvenly() {
			int expectedNumberOfCardsEach = 52;
			SnapGame game = new SnapGame(2,MatchType.EXACT);
			game.dealTheCards();
			int actualNumberOfCardsPlayerOne = game.getPlayerOneHand().size();
			int actualNumberOfCardsPlayerTwo = game.getPlayerTwoHand().size();			
			assertEquals(expectedNumberOfCardsEach,actualNumberOfCardsPlayerOne);
			assertEquals(expectedNumberOfCardsEach,actualNumberOfCardsPlayerTwo);			
			
	    }	
	@Test
	   public void makeSureTheDeckShuffled() {
		
	}

}
