package inheritance;

public class Card {
	private char shape; // S H D C Suit
	private int num; // 1 - 13
	
	public Card() {
	}
	
	public void invalidNum(int invalidNum) {
		if (invalidNum < 1 || invalidNum > 13) {
			throw new IllegalArgumentException("Invalid value");
		} 
	}
	
	public void invalidShape(char invalidShape) {
		if ((invalidShape != 'S' || invalidShape != 'H') || (invalidShape != 'D' || invalidShape != 'C')) {
			throw new IllegalArgumentException("Invalid value");
		} 
	}
	
	public Card(char shape, int num) {
		if (num < 1 || num > 13) {
			throw new IllegalArgumentException("Invalid value");
		} else if ((shape != 'S' && shape != 'H') && (shape != 'D' && shape != 'C')) {
			throw new IllegalArgumentException("Invalid value");
		} else {
			this.shape = shape;
			this.num = num;
		}
	}
	
	public char getSuit() {
		return shape;
	}
	
	public int getFace() {
		return num;
	}
	
	public void setSuit(char newShape) {
		invalidShape(newShape);
		shape = newShape;
	}
	
	public void setFace(int newNum) {
		invalidNum(newNum);
		num = newNum;
	}
	
	public String toString() {
		String newShape = Character.toString(shape);
		String newNum = Integer.toString(num);
		System.out.println(newShape);
		System.out.println(newNum);
		
		return newShape + newNum;
	}
	
	public static void main(String arg[]) {
	    Card dnb = new Card('S', 1);
	    System.out.println(dnb.toString());
	   

	}
}
