package com.java.corejava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite {
	public static void main(String[] args) throws IOException {
		File f1=new File("c:/revatureperungudi/fourth.txt");
		FileOutputStream fwrite = new FileOutputStream(f1);
		
		Employee e1 = new Employee();
		e1.setName("gayathri");
		e1.setEmail("gayathri123@gmail.com");
		e1.setAddress("hyd");
		e1.setSalary(20000.00f);
		
		ObjectOutputStream out = new ObjectOutputStream(fwrite);
		out.writeObject(e1);
//		file will understand only data but we r writing obj, obj only understand by java
		
		out.close();
		fwrite.close();
		
		System.out.println("object written");
//		object written is not understandable for that we have to read
	}

}
