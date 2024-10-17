package com.twitter.service;

import java.util.List;

import com.twitter.dao.TwitterDAO;
import com.twitter.dao.TwitterDAOInterface;
import com.twitter.user.TwitterUser;

public class TwitterService implements TwitterServiceInterface {

	@Override
	public int createProfileService(TwitterUser tu) {
		 TwitterDAOInterface tdi = new TwitterDAO();
		 return tdi.createProfileDAO(tu);	
	}

	@Override
	public TwitterUser viewProfileService(TwitterUser tu) {
		 TwitterDAOInterface tdi = new TwitterDAO(); 
		 return tdi.viewProfileDao(tu);
	}

	@Override
	public List<TwitterUser> viewallProfileService() {
		TwitterDAOInterface tdi = new TwitterDAO();
		return tdi.viewallProfileDAO();
	}

	@Override
	public TwitterUser searchProfileService(TwitterUser tu) {
		TwitterDAOInterface tdi = new TwitterDAO();
		 return tdi.searchProfileDAO(tu);
	}

	@Override
	public TwitterUser loginProfileService(TwitterUser tu) {
		TwitterDAOInterface tdi = new TwitterDAO();
		return tdi.loginProfileDAO(tu);
	}

	@Override
	public int editProfileService(TwitterUser tu) {
		TwitterDAOInterface tdi=new TwitterDAO();
		return tdi.editProfileDAO(tu);
	}

	@Override
	public int deleteProfileService(TwitterUser tu) {
		TwitterDAOInterface tdi=new TwitterDAO();
		return tdi.deleteProfileDAO(tu);
	}

	

}