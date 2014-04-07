package it.skedenpio.cards;

import it.skedenpio.Game;

public class CardLuca extends Card {

	public CardLuca() {
		super("NderCulo", "E' il tuo turno sfortunato, torna indietro di 2 casella e non guadagni una mazza");
	}

	@Override
	public void execute() {
		goBack();
		super.gainPoits(0);
	}
	
	@Override
	protected void goBack() {
		Game.goBack();
		Game.goBack();
	}

}
