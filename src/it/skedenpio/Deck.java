package it.skedenpio;

import it.skedenpio.cards.*;

public class Deck {
	
	private static Card[] cards = { 
		new CardGiuseppe(), 
		new CardLaura(), 
		new CardNicolaProf(),
		new CardPesce(),
		new CardMarcello(),
		new CardPierluigi(),
		new CardAda(),
		new CardDaniela(),
		new CardMike();
	};

	public static Card getRandomCard() {
		int index = (int) (Math.random()*cards.length);
		return cards[index];
	}

}
