package encapsulation;

// 
public class CardDeck {
	private int n;
	private Card deckAll[];
	
	public CardDeck(int n) {
		Card deckS[] = new Card[n];
		Card deckH[] = new Card[n];
		Card deckD[] = new Card[n];
		Card deckC[] = new Card[n];
		
		Card deckAll[] = new Card[n*4];
		
		//String deck[] = new String[n*4];
		//Card newCard = new Card('S', String.valueOf(i+1))
		for(int i = 0; i < n; i++){
			deckS[i] = new Card('S', i+1);
			deckH[i] = new Card('H', i+1);
			deckD[i] = new Card('D', i+1);
			deckC[i] = new Card('C', i+1);
		}
		
		System.arraycopy(deckS, 0, deckAll, 0, n);
		System.arraycopy(deckH, 0, deckAll, n, n);
		System.arraycopy(deckD, 0, deckAll, 2*n, n);
		System.arraycopy(deckC, 0, deckAll, 3*n, n);
		
		this.n = n;
		this.deckAll = deckAll;
		for(int j = 0; j < n*4; j++) {
			System.out.println(deckAll[j]);
		}
		
	}

	public int getCardCount(){
		return n*4;
	}

	public Card getCard(int newN){
		if (newN <= n*4-1 && newN >= 0){
			return deckAll[newN];
		} else {
			throw new IllegalArgumentException("Invalid value");
		} 
	}
	
	public void shufflePerfectly() {
	    Card deckNew[] = new Card[n*4];
	    Card top[] = new Card[n*2];
	    Card bot[] = new Card[n*2];
	    
	    System.arraycopy(deckAll, 0, top, 0, n*2);
	    //System.out.println(top);
	    System.arraycopy(deckAll, n*2, bot, 0, n*2);
	    //System.out.println(bot);
	    
	    //top = deckAll.slice(0, n*2);
	    //bot = deckAll.slice(n*2, n*4);
	    
	    for(int j=0; j < n*2; j++) {
	    	deckNew[j*2] = top[j];
	    	deckNew[j*2+1]= bot[j];
	    	//System.out.println(deckNew[j*2]);
	    } 		
	    //System.out.println(deckNew);
	    //System.out.println(deckAll);
	    deckAll = deckNew;
	}
	
	public static void main(String arg[]) {
	    CardDeck dnb = new CardDeck(10);
	    dnb.getCard(5);
	    dnb.getCard(40);
	    
	    //System.out.println(dnb.toString());
	}
	
}
