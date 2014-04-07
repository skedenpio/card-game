package it.skedenpio.cards;

public class CardLaura extends Card {

	public CardLaura() {
		super("Abbracciamoci", "E' il momento degli abbracci! Vai avanti di una casella e ottieni 15 punti.");
	}
	
	@Override
	public void execute() {
		super.goNext();
		super.gainPoits(15);
	}

}
