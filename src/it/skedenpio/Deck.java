package it.skedenpio;

import it.skedenpio.cards.*;

public class Deck {
	
<<<<<<< HEAD
	private static Card[] cards = { new CardGiuseppe(), new CardDaniela() };
=======
	private static Card[] cards = { new CardGiuseppe(), new CardLaura(), new CardNicolaProf() };
>>>>>>> 26299c6080a304eddddcb336f2b0bc8990814a4f

	public static Card getRandomCard() {
		int index = (int) (Math.random()*cards.length);
		return cards[index];
	}

}
