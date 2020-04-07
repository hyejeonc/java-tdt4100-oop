package interfaces.twitter;

public class Tweet {
	private TwitterAccount twitAccount;
	private String tweetText;
	private Tweet preTweet, postTweet;
	public int count = 0;
	//public int refer = 0;
	
	
	public Tweet() {
	}
	
	public Tweet(TwitterAccount twitAccount, String tweetText){
		this.twitAccount = twitAccount;
		this.tweetText = tweetText;
	}
	
	
	
	public Tweet(TwitterAccount twitAccount, Tweet tweet) {
		System.out.println("A");
		System.out.println(twitAccount.getUserName());
		System.out.println("B");
		System.out.println(twitAccount);
		System.out.println("C");
		System.out.println(twitAccount.getUserName());
		System.out.println("D");
		//System.out.println(tweet.twitAccount.getUserName());
		
		if (tweet.twitAccount.getUserName() == null) {
			throw new IllegalArgumentException("Tweet is undefined.");
		}
		else if (twitAccount.getUserName() == tweet.twitAccount.getUserName()){
			throw new IllegalArgumentException("Tweet is retwitted from same user.");	
		} else {
			System.out.println("E");
			System.out.println(tweet.getText());
			preTweet = tweet;
			System.out.println("F");
			this.twitAccount = twitAccount;
			tweetText = tweet.getText();
			System.out.println("G");
			if (tweet.getOriginalTweet() == null) {
				System.out.println("H");
				System.out.println(tweet.count);
				tweet.count++;
				System.out.println(this.count);
				System.out.println(tweet.count);
			} else {
				tweet.getOriginalTweet().count += 1;
			}
			//System.out.println(tweet.getOriginalTweet().getText());
			
			
			//System.out.println(tweet.getOriginalTweet().getText());
		}
	}
	
	public String getText() {
		return tweetText;
	}
	
	public TwitterAccount getOwner() {
		return twitAccount;
	}
	
	public Tweet getOriginalTweet() {
		//int num = 0;
		
		if (preTweet == null) {
			return null;
		} else {
			Tweet var = preTweet;
			while (true) {
				if (var.preTweet == null) {
					//this.count++;
					System.out.println(count);
					return var;
				} else {
					var = var.preTweet;
				}
			}
		}
	}
	
	public int getRetweetCount() {
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
