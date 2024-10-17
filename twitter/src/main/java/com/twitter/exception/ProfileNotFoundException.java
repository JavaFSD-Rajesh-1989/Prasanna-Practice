package com.twitter.exception;

public class ProfileNotFoundException extends Exception {
    String message;
	
	public ProfileNotFoundException(String message){
		this.message=message;
	}
	
	public String toString() {
		return "i am exception "+message;
	}

}
