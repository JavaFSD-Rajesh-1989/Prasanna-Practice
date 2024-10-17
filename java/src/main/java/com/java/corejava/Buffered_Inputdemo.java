package com.java.corejava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Inputdemo {
	public static void main(String[] args) throws IOException {
		File f2=new File("c:/revatureperungudi/third.txt");
        
//		here i want to take i/p from console and i want to store that
//		all work we are doing using scanner we can do with buffer reader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("plz enter data");
		String input=br.readLine();
		
		FileOutputStream fwrite = new FileOutputStream(f2);
		
		for(int i=0;i<input.length();i++) {
			fwrite.write(input.charAt(i));  //to take charac by charac we charAt()
		}
		fwrite.close();

		System.out.println("data entered");
	}

}
