package com.twitter.utility;

import java.util.Comparator;

import com.twitter.user.TwitterUser;

public class SortByName implements Comparator<TwitterUser>{

	@Override
	public int compare(TwitterUser o1, TwitterUser o2) {
		return o1.getName().compareTo(o2.getName());
	}
	

}
