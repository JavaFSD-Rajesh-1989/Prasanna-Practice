package com.twitter.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.user.TwitterUser;

public class TwitterDaoTest {

	private TwitterDAOInterface tdao;
	@Before
	public void setUp() throws Exception {
		tdao=new TwitterDAO();
	}

	@After
	public void tearDown() throws Exception {
		tdao=null;
	}

	@Test
	public void testCreateProfileDAO() {
		TwitterUser tu = new TwitterUser();
		tu.setName("lakshmi");
		tu.setPassword("laxmi");
		tu.setEmail("lakshmi53@gmail.com");
		
		int i = tdao.createProfileDAO(tu);
		assert i>0 : "could not create profile";
	}

	@Test
	public void testViewProfileDao() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testViewallProfileDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testSearchProfileDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testLoginProfileDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testEditProfileDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDeleteProfileDAO() {
		System.out.println("Not yet implemented");
	}

}
