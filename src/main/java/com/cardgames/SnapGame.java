package com.cardgames;

import java.util.ArrayList;
import java.util.List;

public class SnapGame {

	public enum MatchType {
		SUIT, VALUE, EXACT;
	}

	private MatchType matchType = MatchType.VALUE;
	private List<Card> deck = new ArrayList<Card>();
	private List<Card> playerOneHand = new ArrayList<Card>();
	private int playerOneWins = 0;
	private List<Card> playerTwoHand = new ArrayList<Card>();
	private int playerTwoWins = 0;

	public SnapGame(int numberOfPacks, MatchType matchType) {
		this.matchType = matchType;
		this.deck = setUpTheDeck(numberOfPacks);
		System.out.println(
				String.format("Playing snap with %s packs of cards, matching by %s", numberOfPacks, matchType));
	}

	public void dealTheCards() {
		for (int i = 0; i < deck.size(); i += 2) {
			playerOneHand.add(deck.get(i));
			playerTwoHand.add(deck.get(i + 1));
		}
		System.out.println("Cards Dealt");
	}

	public void playGame() {
//		while (!playerOneHand.isEmpty() && !playerTwoHand.isEmpty()) {
		//TODO: Need to fix the iteration
			for (int i = 0; i<= deck.size()/2-1; i += 2) {
				if (playerOneHand.get(i).compareTo(playerTwoHand.get(i)) == 0) {
					System.out.println("Player 1: "  + playerOneHand.get(i));
					System.out.println("Player 2: "  + playerTwoHand.get(i));					
					playerOneWins++;
					System.out.println("Player 1: SNAP! ");
					System.out.println(String.format("Player 1: has won %s cards",playerOneWins));
				}
				System.out.println("Player 1: "  + playerOneHand.get(i));
				System.out.println("Player 2: "  + playerTwoHand.get(i));					
				
				if (playerTwoHand.get(i+1).compareTo(playerOneHand.get(i+1)) == 0) {
					playerTwoWins++;
					System.out.println("Player 2: SNAP! ");					
					System.out.println(String.format("Player 2: has won %s cards",playerTwoWins));
				}
				System.out.println("Player 1: "  + playerOneHand.get(i+1));
				System.out.println("Player 2: "  + playerTwoHand.get(i+1));					

//			}
		}
			printTheWinner();
	}
	private void printTheWinner() {
			if(playerOneWins > playerTwoWins) {
				System.out.println(String.format("The Winner is player1 with %s cards, player2 had %s cards", playerOneWins, playerTwoWins));				
			} else if(playerTwoWins > playerOneWins){
				System.out.println(String.format("The Winner is player2 with %s cards, player1 had %s cards",  playerTwoWins, playerOneWins));				
			} else {
				System.out.println(String.format("Its a draw player1 has %s cards, player2 has %s cards",  playerOneWins, playerTwoWins));
			}

	}

	private List<Card> setUpTheDeck(int numberOfPacks) {
		List<Card> deck = new ArrayList<Card>();
		while (numberOfPacks > 0) {
			deck.addAll(Card.createPack());
			numberOfPacks--;
		}
		return Card.shuffleCards(deck);
	}

	public List<Card> getDeck() {
		return deck;
	}

	public List<Card> getPlayerOneHand() {
		return playerOneHand;
	}

	public List<Card> getPlayerTwoHand() {
		return playerTwoHand;
	}

	public static void main(String[] args) {
		SnapGame game = new SnapGame(10, MatchType.EXACT);
		game.dealTheCards();
		game.playGame();
//		for (Card card : game.playerOneHand) {
//			System.out.println("PLAYER1: " + card.toString());
//		}
//		System.out.println("PLAYER1 cards: " + game.playerOneHand.size());
//		for (Card card : game.playerTwoHand) {
//			System.out.println("PLAYER2: " + card.toString());
//		}
//		System.out.println("PLAYER2 cards: " + game.playerTwoHand.size());
	}
}
