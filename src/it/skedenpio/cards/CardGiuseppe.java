package it.skedenpio.cards;

public class CardGiuseppe extends Card {

	public CardGiuseppe() {
		super("Compleanno", "E' il tuo compleanno, avanzi di una casella e guadagni 10 punti");
	}

	@Override
	public void execute() {
		super.goNext();
		super.gainPoits(10);
	}

}
