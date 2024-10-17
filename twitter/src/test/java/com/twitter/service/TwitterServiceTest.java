package com.twitter.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.twitter.user.TwitterUser;
import com.twitter.utility.TwitterServiceFactory;

public class TwitterServiceTest {

	private TwitterServiceInterface ts;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 ts = TwitterServiceFactory.createObject("user");
	}

	@After
	public void tearDown() throws Exception {
		ts=null;
	}

	@Test
	public void testCreateProfileService() {
		TwitterUser tu=new TwitterUser();
		tu.setName("jessy");
		tu.setEmail("jessy25@gmail.com");
		tu.setPassword("jessik");

		int i=ts.createProfileService(tu);
		
		assert i>0 : "profile not created";
	}

	@Test
	public void testViewProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testViewallProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testSearchProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testLoginProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testEditProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDeleteProfileService() {
		System.out.println("Not yet implemented");
	}

}
