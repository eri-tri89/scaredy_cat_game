package se.erikperez.scaredycat.model;

import javafx.scene.image.Image;

public class Card {

	private String name;
	private Image cardImage;
	private CardType cardType;

	public Card(CardType cardType) {
		this.cardType = cardType;
		this.name = cardType.getName();
		this.cardImage = new Image(getClass().getClassLoader().getResource(cardType.getPicturePath()).toString());
	}

	public String getName() {
		return name;
	}

	public Image getCardImage() {
		return cardImage;
	}

	public CardType getCardType() {
		return cardType;
	}
	
	

}
