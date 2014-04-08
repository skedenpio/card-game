package it.skedenpio.cards;

public class CardMarcello extends Card {
	public CardMarcello()
	{
		super("LunaNera", "Hai trovato la luna nera, vai indietro di una casella e guadagni 0 punti");
	}
	@Override
	public void execute()
	{
		super.goBack();
		super.gainPoits(0);
	}
}
