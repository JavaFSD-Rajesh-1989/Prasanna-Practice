package com.twitter.dao;

import java.util.List;

import com.twitter.user.TwitterUser;

public interface TwitterDAOInterface {

	int createProfileDAO(TwitterUser tu);

	TwitterUser viewProfileDao(TwitterUser tu);

	List<TwitterUser> viewallProfileDAO();

	TwitterUser searchProfileDAO(TwitterUser tu);

	TwitterUser loginProfileDAO(TwitterUser tu);

	int editProfileDAO(TwitterUser tu);

	int deleteProfileDAO(TwitterUser tu);


}
