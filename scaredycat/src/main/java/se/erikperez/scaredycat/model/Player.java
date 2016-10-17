package se.erikperez.scaredycat.model;

import java.util.ArrayList;

public class Player {

	private String name; 
	private int age;
	private ArrayList<Card> hand;
	
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.hand = new ArrayList<Card>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void saveCardinHand(Card card){
		this.hand.add(card);
	} 
	
}
