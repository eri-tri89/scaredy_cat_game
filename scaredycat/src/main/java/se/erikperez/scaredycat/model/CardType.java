package se.erikperez.scaredycat.model;

public enum CardType {
	BIRD_1, BIRD_2, BIRD_3, BIRD_4, BIRD_5, BIRD_6, BIRD_7, BIRD_8, BIRD_9, BIRD_10, BIRD_11, BIRD_12, CAT_1, CAT_2, CAT_3, SCARECROW_PART1, SCARECROW_PART2, SCARECROW_PART3, SCARECROW_PART4, SCARECROW_PART5, SCARECROW_PART6;

	public String getName() {
		String name = "";
		switch (this) {
		case BIRD_1:
		case BIRD_2:
		case BIRD_3:
		case BIRD_4:
		case BIRD_5:
		case BIRD_6:
		case BIRD_7:
		case BIRD_8:
		case BIRD_9:
		case BIRD_10:
		case BIRD_11:
		case BIRD_12:
			name = "Bird card";
			break;
		case CAT_1:
		case CAT_2:
		case CAT_3:
			name = "Cat card";
			break;
		case SCARECROW_PART1:
			name = "Scarecrow part 1";
			break;
		case SCARECROW_PART2:
			name = "Scarecrow part 2";
			break;
		case SCARECROW_PART3:
			name = "Scarecrow part 3";
			break;
		case SCARECROW_PART4:
			name = "Scarecrow part 4";
			break;
		case SCARECROW_PART5:
			name = "Scarecrow part 5";
			break;
		case SCARECROW_PART6:
			name = "Scarecrow part 6";
			break;
		default:
			name = "no_name";
		}
		return name;
	}
	
	public String getPicturePath(){
		StringBuilder pathBuilder = new StringBuilder();
		pathBuilder.append("image/");
		switch (this) {
		case BIRD_1:
			pathBuilder.append("bird-1.jpg");
			break;
		case BIRD_2:
			pathBuilder.append("bird-2.jpg");
			break;
		case BIRD_3:
			pathBuilder.append("bird-3.jpg");
			break;
		case BIRD_4:
			pathBuilder.append("bird-4.jpg");
			break;
		case BIRD_5:
			pathBuilder.append("bird-5.jpg");
			break;
		case BIRD_6:
			pathBuilder.append("bird-6.jpg");
			break;
		case BIRD_7:
			pathBuilder.append("bird-7.jpg");
			break;
		case BIRD_8:
			pathBuilder.append("bird-8.jpg");
			break;
		case BIRD_9:
			pathBuilder.append("bird-9.jpg");
			break;
		case BIRD_10:
			pathBuilder.append("bird-10.jpg");
			break;
		case BIRD_11:
			pathBuilder.append("bird-11.jpg");
			break;
		case BIRD_12:
			pathBuilder.append("bird-12.jpg");
			break;
		case CAT_1:
			pathBuilder.append("cat-1.jpg");
			break;
		case CAT_2:
			pathBuilder.append("cat-2.jpg");
			break;
		case CAT_3:
			pathBuilder.append("cat-3.jpg");
			break;
		case SCARECROW_PART1:
			pathBuilder.append("scarecrow-1.jpg");
			break;
		case SCARECROW_PART2:
			pathBuilder.append("scarecrow-2.jpg");
			break;
		case SCARECROW_PART3:
			pathBuilder.append("scarecrow-3.jpg");
			break;
		case SCARECROW_PART4:
			pathBuilder.append("scarecrow-4.jpg");
			break;
		case SCARECROW_PART5:
			pathBuilder.append("scarecrow-5.jpg");
			break;
		case SCARECROW_PART6:
			pathBuilder.append("scarecrow-6.jpg");
			break;
		default:
			pathBuilder.append("noSpecified");
		}
		return pathBuilder.toString();
	}

	public int getBirdValue() {
		int value = 0;
		switch (this) {
		case BIRD_1:
			value = 1;
			break;
		case BIRD_2:
			value = 2;
			break;
		case BIRD_3:
			value = 3;
			break;
		case BIRD_4:
			value = 4;
			break;
		case BIRD_5:
			value = 5;
			break;
		case BIRD_6:
			value = 6;
			break;
		case BIRD_7:
			value = 7;
			break;
		case BIRD_8:
			value = 8;
			break;
		case BIRD_9:
			value = 9;
			break;
		case BIRD_10:
			value = 10;
			break;
		case BIRD_11:
			value = 11;
			break;
		case BIRD_12:
			value = 12;
			break;
		default:
			value = 0;
		}
		return value;
	}
}
