package com.twitter.view;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.twitter.controller.TwitterControllerInterface;
import com.twitter.utility.TwitterControllerFactory;

public class TwitterView {
	private static Logger log = Logger.getLogger("TwitterView");
	
	public static void main(String[] args) {
		
		String ss = "y";
		while(ss.equals("y")) {
		
		log.info("***main menu***");
		log.info("enter 1 to create profile");
		log.info("enter 2 to view profile");
		log.info("enter 3 to view all profiles");
		log.info("enter 4 to search profile");
		log.info("enter 5 to login profile");
		log.info("enter 6 to edit profile ");
		
		System.err.println("iam error");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur choice");
		int i = sc.nextInt();
		
//		TwitterControllerInterface tci = new TwitterController();
		
//		it is not following any design pattern
//		we should create obj using factory/singleton design pattern
//		we should create obj of a class using creational design pattern from GOF(gang of 4
		
		TwitterControllerInterface tci = TwitterControllerFactory.createObject("user");

		
		switch(i) {
		case 1:tci.createProfileController();
			break;
		case 2:tci.viewProfileController();
		    break;
		case 3:tci.viewallProfileController();
		    break;
		case 4:tci.searchProfileController();
		    break;
		case 5:tci.loginProfileController();
		    break;
		case 6:tci.editProfileController();
		    break;
		case 7:tci.deleteProfileController();
		    break;
			default:System.out.println("wrng choice");
		}
		System.out.println("press y to continue");
		ss=sc.next();
	    }

	}

}
