package se.erikperez.scaredycat.model;

public enum CardType {
	
	//Bird cards
	BIRD_2("Bird Card",2,"image/card/bird-2.jpg"), BIRD_3("Bird Card",3,"image/card/bird-3.jpg"), 
	BIRD_4("Bird Card",4,"image/card/bird-4.jpg"), BIRD_5("Bird Card",5,"image/card/bird-5.jpg"), 
	BIRD_6("Bird Card",6,"image/card/bird-6.jpg"), BIRD_7("Bird Card",7,"image/card/bird-7.jpg"), 
	BIRD_8("Bird Card",8,"image/card/bird-8.jpg"), BIRD_9("Bird Card",9,"image/card/bird-9.jpg"), 
	BIRD_10("Bird Card",10,"image/card/bird-10.jpg"), BIRD_11("Bird Card",11,"image/card/bird-11.jpg"), 
	BIRD_12("Bird Card",12,"image/card/bird-12.jpg"),
	
	//Cat cards
	CAT_1("Cat Card",0,"image/card/cat-1.jpg"), CAT_2("Cat Card",0,"image/card/cat-2.jpg"), 
	CAT_3("Cat Card",0,"image/card/cat-3.jpg"),
	
	//Scare crow cards
	SCARECROW_PART1("Scarecrow card",0,"image/card/scarecrow-1.jpg"), SCARECROW_PART2("Scarecrow card",0,"image/card/scarecrow-2.jpg"), 
	SCARECROW_PART3("Scarecrow card",0,"image/card/scarecrow-3.jpg"), SCARECROW_PART4("Scarecrow card",0,"image/card/scarecrow-4.jpg"), 
	SCARECROW_PART5("Scarecrow card",0,"image/card/scarecrow-5.jpg"), SCARECROW_PART6("Scarecrow card",0,"image/card/scarecrow-6.jpg");

	private String name, picturePath;

	private int value;

	private CardType(String name, int value, String picturePath) {
		this.name = name;
		this.value = value;
		this.picturePath = picturePath;
	}
	
	public String getPicturePath() {
		return picturePath;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

}
