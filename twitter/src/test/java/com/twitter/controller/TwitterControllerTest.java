package com.twitter.controller;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.twitter.utility.TwitterControllerFactory;


public class TwitterControllerTest {

	private TwitterControllerInterface tc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("loading global resource");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("unloading global resource");
	}

	@Before
	public void setUp() throws Exception {
		 tc=TwitterControllerFactory.createObject("user");
	}

	@After
	public void tearDown() throws Exception {
		tc=null;
	}

	@Test
	public void testCreateProfileController() {
		tc.createProfileController();
	}

	@Test
	public void testViewProfileController() {
		System.out.println("not yet implemented");
	}

	@Test
	public void testViewallProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testSearchProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testLoginProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testEditProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDeleteProfileController() {
		System.out.println("Not yet implemented");
	}

}
