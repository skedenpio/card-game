package it.skedenpio.cards;

public class CardAntonio extends Card {
	
	public CardAntonio() {
		super("Sbirri", "Hai trovato un posto di blocco e vieni arrestato, torna indietro di 4 e meno 20 punti");
	}

	@Override
	public void execute() {
		super.goBack();
		super.goBack();
		super.goBack();
		super.goBack();
		super.gainPoits(-20);
	}

}
