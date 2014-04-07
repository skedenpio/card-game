package it.skedenpio.cards;


public class CardNicola extends Card {

	public CardNicola() {
		super("Pernacchia", "Vai avanti di una casella e perdi tutti i punti.. Prrrrrrr");
	}

	@Override
	public void execute() {
		super.goNext();
		super.losePoints();
	}

}
