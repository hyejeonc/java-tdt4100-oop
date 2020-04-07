package interfaces.twitter;
import java.util.Comparator;

public class FollowersCountComparator implements Comparator<TwitterAccount>{
	
	public FollowersCountComparator() {
	}
	
	public FollowersCountComparator(TwitterAccount a, TwitterAccount b) {
	}
	
	public int compare(TwitterAccount a, TwitterAccount b) {
		
		if (a.getFollowerCount() > b.getFollowerCount()) {
			return -1;
		} else if (a.getFollowerCount() < b.getFollowerCount()) {
			return +1;
		} else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
