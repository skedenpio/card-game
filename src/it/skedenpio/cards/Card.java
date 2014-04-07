package it.skedenpio.cards;

import it.skedenpio.Game;

public abstract class Card {
	
	private String name = "";
	private String message = "";
	
	public abstract void execute();
	
	protected Card(String name, String message) {
		this.name = name;
		this.message = message;
	}
	
	protected void goNext() {
		Game.goNext();
	}
	
	protected void goBack() {
		Game.goBack();
	}
	
	protected void gainPoits(int points) {
		Game.gainPoints(points); 
	}
	
	protected void losePoints() {
		Game.losePoints();
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

}
