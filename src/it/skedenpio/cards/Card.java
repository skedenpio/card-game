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
	
	public abstract void pictures();	
	
	protected void goNext() {
		Game.goNext();
	}
	
	protected void goBack() {
		Game.goBack();
	}
	
	protected void gainPoits(int points) {
		Game.gainPoints(points); 
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

}
