package it.skedenpio.cards;

public class CardNicola extends Card  {

	public CardNicola() {
		super("3 X 2","Ti piace vincere facile !!!");
	}

	@Override
	public void execute() {
		super.goNext();
		
		super.goBack();
		super.goNext();
		super.goBack();
		super.goNext();
		
		super.gainPoits(1);
	}

}
