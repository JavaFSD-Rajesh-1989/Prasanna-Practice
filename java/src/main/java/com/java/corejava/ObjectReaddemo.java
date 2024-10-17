package com.java.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReaddemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f2 = new File("c:/revatureperungudi/fourth.txt");
		FileInputStream fread = new FileInputStream(f2);
		
		ObjectInputStream oread = new ObjectInputStream(fread);
		Employee ee=(Employee) oread.readObject();
		System.out.println(ee.getName());
		System.out.println(ee.getEmail());
		System.out.println(ee.getAddress());
		System.out.println(ee.getSalary());
		
	}

}
