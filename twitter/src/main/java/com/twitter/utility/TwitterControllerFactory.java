package com.twitter.utility;

import com.twitter.controller.TwitterController;
import com.twitter.controller.TwitterControllerInterface;

public class TwitterControllerFactory {
	private TwitterControllerFactory() {
		
	}

	public static TwitterControllerInterface createObject(String n) {
		if(n.equals("user")) {
		return new TwitterController();
		}
		return null;
	}

}
