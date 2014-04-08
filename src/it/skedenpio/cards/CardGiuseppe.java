package it.skedenpio.cards;

public class CardGiuseppe extends Card {

	public CardGiuseppe() {
		super("Compleanno", "E' il tuo compleanno, avanzi di una casella e guadagni 10 punti");
	}

	@Override
	public void execute() {
		super.goNext();
		super.gainPoits(10);
	}

	@Override
	public void pictures() {
		
		System.out.println("----------------------------");
		System.out.println("--         ,,,,,          --");
		System.out.println("--        _|||||_         --");
		System.out.println("--       {~*~*~*~}        --");
		System.out.println("--     __{*~*~*~*}__      --");
		System.out.println("--    `-------------`     --");
		System.out.println("--                        --");
		System.out.println("--     --------------     --");
		System.out.println("--     |   AUGURI   |     --");
		System.out.println("--     |   ROBERTO  |     --");
		System.out.println("--     --------------     --");
		System.out.println("----------------------------");
		
		
	}

}
