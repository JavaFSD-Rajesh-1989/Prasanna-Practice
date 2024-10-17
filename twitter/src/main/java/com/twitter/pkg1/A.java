package com.twitter.pkg1;

public class A {
	void add() {       
	}
	 static void sub() {}
	void main() {
		add();   //non static method in non static method
		sub();   //static in non static 
	}
	public static void main(String[] args) {
//		add();  as add() is ns it cant be called in static method so we created new obj
		A a = new A();
		a.add();
		 
		sub();  //static method in another static method
	}

}
