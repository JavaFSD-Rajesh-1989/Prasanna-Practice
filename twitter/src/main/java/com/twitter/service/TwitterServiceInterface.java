package com.twitter.service;

import java.util.List;

import com.twitter.user.TwitterUser;

public interface TwitterServiceInterface {

	int createProfileService(TwitterUser tu);

	TwitterUser viewProfileService(TwitterUser tu);

	List<TwitterUser> viewallProfileService();

	TwitterUser searchProfileService(TwitterUser tu);

	TwitterUser loginProfileService(TwitterUser tu);

	int editProfileService(TwitterUser tu);


	int deleteProfileService(TwitterUser tu);



}
