package com.twitter.utility;

import java.util.Comparator;

import com.twitter.user.TwitterUser;

public class SortByEmail implements Comparator<TwitterUser> {

	@Override
	public int compare(TwitterUser o1, TwitterUser o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}

}
