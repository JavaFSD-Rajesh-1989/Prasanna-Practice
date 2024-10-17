package com.twitter.pkg1;

public class B {
	void div() {
		A a =  new A();
		a.add();   //non static method called by creating obj
		
		A.sub();  //sub is static method in cls A so we call it with using cls name
	}
	public static void main(String[] args) {
		A a = new A();
		a.add();
		
		B b =new B();
		b.div();
		
		A.sub();   //even it is static method but as it is another cls we call it using cls name
	}

}
