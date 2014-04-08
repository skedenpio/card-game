package it.skedenpio.cards;

public class CardFrancesco extends Card {

	public CardFrancesco() {
		super("Carta di Fra", "Mè gioca mè...");
	}

	@Override
	public void execute() {
		super.goNext();
		super.goNext();
		super.gainPoits(10);

	}

}
