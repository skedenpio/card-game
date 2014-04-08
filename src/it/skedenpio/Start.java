package it.skedenpio;

import it.skedenpio.cards.Card;


public class Start {

	public static void main(String[] args) throws Exception {
		boolean isFinished = false;

		Drawer.printGame(null);
		
		while(!isFinished) {
			System.out.println("Premi INVIO per pescare una carta");
			System.in.read();
			Card card = Deck.getRandomCard();
			isFinished = Game.executeRound(card);
			Drawer.printGame(card);
		}
		
		System.out.println("Congratulazioni, hai terminato il gioco con " + Game.getPoints() + " punti!");
	}

}
