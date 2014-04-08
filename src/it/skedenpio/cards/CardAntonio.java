package it.skedenpio.cards;

public class CardAntonio extends Card {
	
	public CardAntonio() {
		super("Sbirri", "Hai trovato un posto di blocco e vieni arrestato, torna indietro di 4 e meno 20 punti");
		this.pictures();
	}

	@Override
	public void execute() {
		super.goBack();
		super.goBack();
		super.goBack();
		super.goBack();
		super.gainPoits(-20);
		
	}
	
	@Override
	public void pictures(){

		System.out.println("----------------------------");
		System.out.println("--                        --");
		System.out.println("--                        --");
		System.out.println("--       _*_  ...iiooiioo --");
		System.out.println("--    __/_|_\\__          --");
		System.out.println("--   [(o)_R__(o)]=§§      --");
		System.out.println("--                        --");
		System.out.println("--   ---------------      --");
		System.out.println("--   |   SBIRRI    |      --");
		System.out.println("--   ---------------      --");
		System.out.println("----------------------------");
		System.out.println("----------------------------");

	}

}
