package com.twitter.utility;

import com.twitter.service.TwitterService;
import com.twitter.service.TwitterServiceInterface;

//singleton
public class TwitterServiceFactory {
	private static TwitterServiceInterface ti=null;

	private TwitterServiceFactory() {
		
	}
	
	public static TwitterServiceInterface createObject(String ss) {
		if(ss.equals("user")) {
			if(ti == null) {
				ti=new TwitterService();
			}
		}
		return ti;
	}

}
