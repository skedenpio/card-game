package it.skedenpio;

import it.skedenpio.cards.*;

public class Deck {
	

	private static Card[] cards = { new CardGiuseppe(),  new CardDaniela() };
	


	public static Card getRandomCard() {
		int index = (int) (Math.random()*cards.length);
		return cards[index];
	}

}
