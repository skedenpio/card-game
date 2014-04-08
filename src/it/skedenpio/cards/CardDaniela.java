package it.skedenpio.cards;

public class CardDaniela extends Card {

	public CardDaniela() {
		super("Natale", "A Natale non siamo tutti più buoni, torna indietro di una casella e guadagni 1 punto");
	}

	@Override
	public void execute() {
		super.goBack();
		super.gainPoits(1);
	}

}
