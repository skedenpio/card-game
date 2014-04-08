package it.skedenpio.cards;

public class CardMike extends Card {

	public CardMike() {
		super("renziano", "Non mi stai per niente simpatico..temo tu sia un renziano doc! E' il tuo giorno sfortunato, vai indietro di una casella e perdi 10 punti");
	}

	@Override
	public void execute() {
		super.goBack();
		super.gainPoits(-10);
	}
}
