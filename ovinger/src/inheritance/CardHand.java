package inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class CardHand implements Iterable<Card>{

	// array to hold Card objects, filled in the constructor
	private ArrayList<Card> cards;
	protected int maxCardCount;

	public CardHand(int maxCardCount) {
		cards = new ArrayList<Card>();
		this.maxCardCount = maxCardCount;
	}

	@Override
	public String toString() {
		return "[Hand " + cards.toString().substring(1);
	}

	public void addCard(Card card) {
		if (cards.size() > maxCardCount-1) {
			throw new IllegalStateException();
		} else {
			this.cards.add(card);
		}	
	}

	public int getCardCount() {
		return cards.size();
	}

	public Card getCard(int i) {
		if (i < 0 || i >= getCardCount()) {
			throw new IllegalArgumentException(String.format("%s is an illegal card index, when the size of the hand is %s", i, getCardCount()));
		}
		return cards.get(i);
	}

	public Card play(int i) {
		return cards.remove(i);
	}

	// Iterable<Card> in CardContainer<Card>

	@Override
	public Iterator<Card> iterator() {
		return cards.iterator();
	}
}
