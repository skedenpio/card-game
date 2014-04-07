package it.skedenpio.cards;

public class CardFrank extends Card {
	
	public CardFrank(){
		super("Assunzione", "Complimenti, sei stato assunto, quindi DEVI PAGAREEEE !!!");
	}

	@Override
	public void execute(){
		super.goBack();
		super.gainPoits(-10);
	}
	
	

}
