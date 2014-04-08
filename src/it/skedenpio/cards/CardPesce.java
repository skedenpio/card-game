package it.skedenpio.cards;

public class CardPesce extends Card {

	public CardPesce() {
		super("Sballone", "Sei stato fortunato, hai trovato la carta sballone, fuma un cannone e vai avanti e guadagni 5 punti");
	}

	@Override
	public void execute() {
		super.goNext();
		super.gainPoits(5);
	}

}
