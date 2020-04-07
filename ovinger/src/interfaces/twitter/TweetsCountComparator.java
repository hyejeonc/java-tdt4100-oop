package interfaces.twitter;
import java.util.Comparator;

public class TweetsCountComparator implements Comparator<TwitterAccount>{
	
	public TweetsCountComparator() {
		
	}
	// o1 > o2 : -1 
	public int compare(TwitterAccount a, TwitterAccount b) {
		//int x = b.getTweetCount();
		if (a.getTweetCount() > b.getTweetCount()){
			return -1;
		} else if (a.getTweetCount() < b.getTweetCount()) {
			return 1;
		} else {
			return 0;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
