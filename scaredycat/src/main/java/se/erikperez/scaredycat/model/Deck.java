package se.erikperez.scaredycat.model;

import java.util.Collections;
import java.util.List;

public final class Deck {

	private List<Card> cardContainer;

	public Deck(){}

	public List<Card> getCardContainer() {
		return cardContainer;
	}

	public void setCardContainer(List<Card> cardContainer) {
		this.cardContainer = cardContainer;
	}
	
	public void shuffle(){
		Collections.shuffle(getCardContainer());
	}
		
}
