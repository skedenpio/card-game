package it.skedenpio.cards;

public class CardLuca extends Card {

	public CardLuca() {
		super("NderCulo", "E' il tuo turno sfortunato, torna indietro di 2 casella e non guadagni una mazza");
	}

	@Override
	public void execute() {
		goBack();
	}
	
	@Override
	protected void goBack() {
		super.goBack();
		super.goBack();
	}

}
