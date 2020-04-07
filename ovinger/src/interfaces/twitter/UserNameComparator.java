package interfaces.twitter;
import java.util.ArrayList;
import java.util.Comparator;

public class UserNameComparator implements Comparator<TwitterAccount>{
	// -1: o1 < o2
	// 1: o2 < o1
	// 0: same parameter 
	
	public UserNameComparator() {
	}
	
	public UserNameComparator(TwitterAccount a, TwitterAccount b) {
		
	}
	
	public int compare(TwitterAccount a, TwitterAccount b) {
		return a.getUserName().compareTo(b.getUserName());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
