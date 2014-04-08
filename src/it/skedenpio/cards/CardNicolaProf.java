package it.skedenpio.cards;


public class CardNicolaProf extends Card {

	public CardNicolaProf() {
		super("Pernacchia", "Vai avanti di una casella e perdi tutti i punti.. Prrrrrrr");
	}

	@Override
	public void execute() {
		super.goNext();
		super.losePoints();
	}

}
