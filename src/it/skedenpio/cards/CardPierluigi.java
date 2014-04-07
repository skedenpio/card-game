package it.skedenpio.cards;
import it.skedenpio.*;


public class CardPierluigi extends Card
{
	public CardPierluigi()
	{
		super("Fortuna","Sei così fortunato che ti faccio tornare al punto di partenza e ovviamente non ti assegno punti");
	}
	@Override
	public void execute()
	{
		int k = Game.getPosition();
		for(int i=0; i<k; i++)
		{
			System.out.println(Game.getPosition());
			super.goBack();
			
		}
		super.gainPoits(0);
	}

}
