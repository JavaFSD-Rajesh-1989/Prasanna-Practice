package com.twitter.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
//import java.util.logging.Logger;

import org.apache.log4j.Logger;

import com.twitter.exception.ProfileNotFoundException;
import com.twitter.service.TwitterService;
import com.twitter.service.TwitterServiceInterface;
import com.twitter.user.TwitterUser;
import com.twitter.utility.SortByEmail;
import com.twitter.utility.SortByName;
import com.twitter.utility.TwitterServiceFactory;

public class TwitterController implements TwitterControllerInterface {

	Logger log = Logger.getLogger("TwitterController");
	
	@Override
	public void createProfileController() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter password");
		String password = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		
		TwitterUser tu = new TwitterUser();
		tu.setName(name);
		tu.setPassword(password);
		tu.setEmail(email);
		
//		create obj of service via interface to maintain low coupling
//		TwitterServiceInterface ts = new TwitterService();
		TwitterServiceInterface ts=TwitterServiceFactory.createObject("user");
		int i=ts.createProfileService(tu);
		if(i>0) {
//			System.out.println("created profile");
			log.info("profile created at "+LocalDateTime.now());
		}else {
//			System.out.println("rejected");
			log.error("could not create");
		}
		
	}

	@Override
	public void viewProfileController() {
//		1st step
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email to view profile");
		String email = sc.next();
		
//		2nd step
		TwitterUser tu = new TwitterUser();
		tu.setEmail(email);
		
//		3rd step
		TwitterServiceInterface tsi = new TwitterService();
		TwitterUser ttu=tsi.viewProfileService(tu);
		
		try {
		if(ttu!=null) {
			System.out.println("your profile is: ");
			System.out.println("name: "+ttu.getName());
			System.out.println("password: "+ttu.getPassword());
			System.out.println("email: "+ttu.getEmail());
		}
		else {
			throw new ProfileNotFoundException("profile not found for "+email);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void viewallProfileController() {
		TwitterServiceInterface ts=new TwitterService();
		List<TwitterUser> li = ts.viewallProfileService();
		
		System.out.println(li.size()+"record found in database");
		
		System.out.println("unsorted result");
		for(TwitterUser tu:li) {
			System.out.println("**********");
			System.out.println("NAME:"+tu.getName());
			System.out.println("PASSWORD:"+tu.getPassword());
			System.out.println("EMAIL:"+tu.getEmail());
		}
		
		Collections.sort(li, new SortByName());
//		whenever we are getting sorted it will sort based on ascii value capital letter names will come first
		System.out.println("sorted result");
		for(TwitterUser tu:li) {
			System.out.println("**********");
			System.out.println("NAME:"+tu.getName());
			System.out.println("PASSWORD:"+tu.getPassword());
			System.out.println("EMAIL:"+tu.getEmail());
		}
		
		Collections.sort(li, new SortByEmail());
		System.out.println("sorted result based on email");
		
//		iterator
		Iterator<TwitterUser> it=li.iterator();
		while(it.hasNext()) {
			TwitterUser l1=it.next();
			System.out.println("**********");
			System.out.println("NAME:"+l1.getName());
			System.out.println("PASSWORD:"+l1.getPassword());
			System.out.println("EMAIL:"+l1.getEmail());
		}
		
//		list iterator - fwd direction
		ListIterator<TwitterUser> lit=li.listIterator();
		while(lit.hasNext()) {
			TwitterUser l1=lit.next();
			System.out.println("**********");
			System.out.println("NAME:"+l1.getName());
			System.out.println("PASSWORD:"+l1.getPassword());
			System.out.println("EMAIL:"+l1.getEmail());
		}
//		list iterator  - backward direction
		ListIterator<TwitterUser> lit1=li.listIterator();
		while(lit1.hasPrevious()) {
			TwitterUser l1=lit1.previous();
			System.out.println("**********");
			System.out.println("NAME:"+l1.getName());
			System.out.println("PASSWORD:"+l1.getPassword());
			System.out.println("EMAIL:"+l1.getEmail());
		}
		for(TwitterUser tu:li) {
			System.out.println("**********");
			System.out.println("NAME:"+tu.getName());
			System.out.println("PASSWORD:"+tu.getPassword());
			System.out.println("EMAIL:"+tu.getEmail());
		}
	}

	@Override
	public void searchProfileController() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name to search");
		String name=sc.next();
		
		TwitterUser tu = new TwitterUser();
		tu.setName(name);
		
		TwitterServiceInterface ts=new TwitterService();
		TwitterUser tu1 = ts.searchProfileService(tu);
		try{
			if(tu1!=null) {
				System.out.println("profile is present");
			}
			else {
				throw new ProfileNotFoundException("profile of this "+name+"is not present");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void loginProfileController() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter password");
		String pass = sc.next();
		
		TwitterUser tu = new TwitterUser();
		tu.setEmail(email);
		tu.setPassword(pass);
		
		TwitterServiceInterface ts = new TwitterService();
		TwitterUser tu2 = ts.loginProfileService(tu);
		
		try {
			if(tu2!=null) {
				System.out.println("Welcome to your Profile");
			}else {
				throw new ProfileNotFoundException("incorrect email/password");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void editProfileController() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email");
		String email = sc.next();
		
		TwitterUser tu = new TwitterUser();
		tu.setEmail(email);
		
		TwitterServiceInterface tsi = new TwitterService();
		TwitterUser tu1=tsi.viewProfileService(tu);
		try {
			if(tu1!=null) {
				System.out.println("your old profile");
				System.out.println("name:"+tu1.getName());
				System.out.println("email:"+tu1.getEmail());
				System.out.println("password:"+tu1.getPassword());
				
				System.out.println("enter 1 to update password");
				int c=sc.nextInt();
				switch(c) {
				case 1:
					System.out.println("enter new password");
					String newp=sc.next();
					tu1.setPassword(newp);
					int e=tsi.editProfileService(tu1);
					if(e>0) {
						System.out.println("password changed");
					}
					
				    break;
				    default: 
				    	System.out.println("enter valid no.");
				}
			}
			else {
				throw new ProfileNotFoundException("wrng"+email);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void deleteProfileController() {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter email to delete profile");
       String email = sc.next();
       
       TwitterUser tu = new TwitterUser();
       tu.setEmail(email);
       
       TwitterServiceInterface tsi=new TwitterService();
       int i=tsi.deleteProfileService(tu);
       if(i>0) {
    	   System.out.println("profile deleted");
       }
       
	}

}
