package interfaces;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Card implements Comparable<Card>{
	
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
		//System.out.println(newShape);
		//System.out.println(newNum);
		
		return newShape + newNum;
	}
	
	@Override
	public int compareTo(Card newCard) {
		// Spade > Heart > Diamond > Clover 
		// a.compareTo(b) == -(b.compareTo(a)) 조건을 만족하게 구성해주면 된다.
		if ((int) this.getSuit() > (int) newCard.getSuit()) {
			return 1;
		} else if (this.getSuit() == newCard.getSuit()) {
			
			if (this.getFace() > newCard.getFace()) {
				return 1;
			} else if (this.getFace() == newCard.getFace()) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1 = new Card('C', 1);
		Card card2 = new Card('H', 11 );
		List<Card> list = new ArrayList<>();
		
		list.add(card1);
		list.add(card2);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
