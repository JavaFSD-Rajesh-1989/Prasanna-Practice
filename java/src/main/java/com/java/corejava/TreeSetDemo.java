package com.java.corejava;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> ss=new TreeSet<String>();
//		it will give result in sorted order
		ss.add("Nikcy");
		ss.add("Bunty");
		ss.add("Rohi");
		ss.add("Manu");
		ss.add("pinku");

		System.out.println(ss);

	}

}
