package interfaces.twitter;
import java.util.Comparator;
import java.util.Collections;

import java.util.ArrayList;

public class TwitterAccount implements Comparator<TwitterAccount>{
	
	private String username = "";
	private ArrayList<Tweet> tweetList = new ArrayList<>();
	private ArrayList<TwitterAccount> followList = new ArrayList<>();
	private ArrayList<TwitterAccount> followerList = new ArrayList<>();

	public TwitterAccount() {
	}
	
	public TwitterAccount(String username){
		this.username = username;
		
	}
	
	public String getUserName() {
		return username;
	}
	
	public void follow(TwitterAccount account) {
		followList.add(account);
		account.followerList.add(this);
	}
	
	public void unfollow(TwitterAccount account) {
		followList.remove(account);
		account.followerList.remove(this);
	}
	
	public boolean isFollowing(TwitterAccount account) {
		if (followList.contains(account)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFollowedBy(TwitterAccount account) {
		// 팔로우 당하는지 알려면, 해당 어카운트에 팔로우 리스트에 내가 있는지 본다 
		if ((account.followList).contains(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void tweet(String newString) {
		tweetList.add(new Tweet(this, newString));
	}
	
	public void retweet(Tweet newTweet) {
		System.out.println(newTweet);
		System.out.println("a");
		System.out.println(newTweet.getOriginalTweet());
		System.out.println("b");
		if (newTweet.getOriginalTweet() == null) {
			tweetList.add(new Tweet(this, newTweet));
		} else {
			tweetList.add(new Tweet(this, newTweet.getOriginalTweet()));
		}
		
		
	}
	
	public Tweet getTweet(int i) {
		return tweetList.get(tweetList.size() - i);
	}
	
	public int getTweetCount() {
		return tweetList.size();
	}
	
	public int getRetweetCount() {
		int result;
		result = 0;
		for(int i = 0; i < tweetList.size(); i++) {
			result += tweetList.get(i).count;
		}
		
		return result;
	}
	
	public int getFollowCount() {
		return followList.size();
	}
	
	public int getFollowerCount() {
		return followerList.size();
	}
	
	public ArrayList<TwitterAccount> getFollowerList(){
		return followerList;
	}
	
	public ArrayList<TwitterAccount> getFollowers(Comparator<TwitterAccount> comparator){
		//Comparator<TwitterAccount> twitFollowerComparator = new Comparator<TwitterAccount>() {
		ArrayList<TwitterAccount> list = followerList;
		
		if (comparator == null) {
			return followerList;
		} else {
			Collections.sort(list, comparator);
			return list;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
