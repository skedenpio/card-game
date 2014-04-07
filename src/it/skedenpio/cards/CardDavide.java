package it.skedenpio.cards;

public class CardDavide extends Card{
	
	public CardDavide(){
		super("Buco nero","E' il tuo giorno sfortunato torni in dietro di 8 caselle");
	}
	@Override
	public void execute(){
		super.goBack();
		super.goBack();
		super.goBack();
		super.goBack();
		super.goBack();
		super.goBack();
		super.goBack();
		super.goBack();
		super.gainPoits(-8);
	}
}
