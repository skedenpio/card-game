package it.skedenpio;

import it.skedenpio.cards.Card;

public class Game {
	
	private static int position = 0;
	private static int points = 0;

	public static int getPosition() {
		return position;
	}

	public static int getPoints() {
		return points;
	}
	
	public static void goNext() {
		position++;
	}
	
	public static void goBack() {
		position--;
		if (position < 0) {
			position = 0;
		}
	}
	
	public static void gainPoints(int points) {
		Game.points += points;
	}
	
	public static void losePoints() {
		Game.points = 0;
	}
	
	public static boolean executeRound(Card card) {
		card.execute();
		
		return(Game.position > 9);
	}

}
