package it.skedenpio;

import it.skedenpio.cards.*;

public class Deck {
	
	private static Card[] cards = { new CardGiuseppe(), new CardLaura(), new CardNicola() };

	public static Card getRandomCard() {
		int index = (int) (Math.random()*cards.length);
		return cards[index];
	}

}
