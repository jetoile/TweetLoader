package com.amundi.loader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class LoadTweets {

	static Logger logger = Logger.getLogger("FILE_APPENDER");
	
	/*
	 * @Shell @Total @CreditAgricole, @amundi, 
	 * 
	 * */
	
	
	public static void main(String[]args) throws TwitterException{
		
	    //Search tweets:
		List<Status>statuses = new ArrayList<Status>();
		statuses.addAll(searchTweet("@total"));
	    statuses.addAll(searchTweet("@amundi"));
	    statuses.addAll(searchTweet("@creditagricole"));
	    statuses.addAll(searchTweet("@shell"));
	    
	    for (Status status : statuses) {
	    	logger.info(status.getText());
	    }
	    
	}
	
	public static List<Status> searchTweet(String tags) throws TwitterException{
		Twitter twitter = new TwitterFactory().getInstance();
	    twitter4j.Query query = new twitter4j.Query(tags);
	    QueryResult result = twitter.search(query);
	    return result.getTweets();
	}
	
	
}
