package interfaces;
// https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Card card1 = new Card('C', 1);
//Card card2 = new Card('H', 11 );
//List<Card> list = new ArrayList<>();

//list.add(card1);
//list.add(card2);
//Collections.sort(list, comparator);

public class CardComparator implements Comparator<Card>{
	private boolean max;
	private char shape = ' ';
	//shape = '';
	
	public CardComparator() {
	}
	
	public CardComparator(boolean max, char suit) {
		this.max = max;
		this.shape = suit;
	}	
	// Spade > Heart > Diamond > Clover 
	// max true 면 에이스가 제일 높음 
	@Override
	public int compare(Card a, Card b) {
		if (a.getSuit() == b.getSuit()) { // 모양 같다 
			if (max == true) { // 에이스가 짱이다 
				if (a.getFace() == b.getFace()) {
					return 0;
				} else if (a.getFace() == 1) {
					return 1;
				} else if (b.getFace() == 1) {
					return -1;
				} else {
					return a.compareTo(b);
				}
			} else { // 킹이 짱이다 
				if (a.getFace() == b.getFace()) {
					return 0;
				} else {
					return a.compareTo(b);
				}
			}
		} else {// 모양이 다르다 
			if (shape == ' ') { // 특정 조건 없으면 
				return a.compareTo(b);
			} else {
				if (a.getSuit() == shape) {
					return 1;
				} else if (b.getSuit() == shape) {
					return 0;
				} else {
					return a.compareTo(b);
				}
			}
		}	
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
