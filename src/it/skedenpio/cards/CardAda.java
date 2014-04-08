package it.skedenpio.cards;

public class CardAda extends Card {
	public CardAda() {
		super("Stallo", "E' il momento di riposare. Non avanzi e non guadagni alcun punto");
	}

	@Override
	public void execute() {
		super.gainPoits(0);
	}
	
}
