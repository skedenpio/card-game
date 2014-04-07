package it.skedenpio;

import it.skedenpio.cards.Card;

public class Drawer {

	public static void printGame(Card card) {
		System.out.print("\u001b[2J");
		System.out.flush();
		System.out.print("\n\n\n\n");
		
		if (card != null) {
			printCardMessage(card);
		}
		printPointsAndPosition();
		printCardTop();
		printCardCenter();
		printCardBottom();
		printArrow();		
		
		System.out.print("\n\n\n\n\n\n");
	}
	
	private static void printCardMessage(Card card) {
		System.out.println("Hai pescato la carta '" + card.getName() + "'");
		System.out.println();
		System.out.println("Messaggio:");
		System.out.println();
		System.out.println(card.getMessage());
		System.out.print("\n\n");
	}

	private static void printPointsAndPosition() {
		System.out.print("Punti: ");
		System.out.print(Game.getPoints());
		System.out.print("     |     ");
		System.out.print("Posizione: ");
		System.out.print(Game.getPosition()+1);
		
		System.out.print("\n\n");
	}
	
	private static void printCardTop() {
		for (int i=0; i<10; i++) {
			System.out.print("---");
			printCardSpace();
		}
		System.out.println();
	}
	
	private static void printCardCenter() {
		for (int i=0; i<10; i++) {
			System.out.print("|");
			if (Game.getPosition() == i) {
				System.out.print("o");
			} else {
				System.out.print(" ");
			}
			System.out.print("|");
			printCardSpace();
		}
		System.out.print("END");
		System.out.println();
	}
	
	private static void printCardBottom() {
		for (int i=0; i<10; i++) {
			System.out.print("---");
			printCardSpace();
		}
		System.out.println();
	}
	
	private static void printArrow() {
		for (int i=0; i<Game.getPosition(); i++) {
			System.out.print("   ");
			printCardSpace();
		}
		System.out.print(" ^");
		System.out.println();
		
		for (int i=0; i<Game.getPosition(); i++) {
			System.out.print("   ");
			printCardSpace();
		}
		System.out.print(" |");
		System.out.println();
	}
	
	private static void printCardSpace() {
		System.out.print("    ");
	}

}


/*

---
|o|
---
 ^
 |

*/