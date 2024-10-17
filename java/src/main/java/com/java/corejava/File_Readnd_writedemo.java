package com.java.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Readnd_writedemo {
	public static void main(String[] args) throws IOException {
		File f1=new File("c:/revatureperungudi/one.txt");
		File f2=new File("c:/revatureperungudi/two.txt");

//		reading in byte mode
		FileInputStream fread = new FileInputStream(f1);
		FileOutputStream fwrite = new FileOutputStream(f2);
		
		int c=0;
//		-1 is ascci value for end of the file.
//		fread.read will read 1 char(it will read ascci value of 1 char) store in c and it will compare with -1 if -1 match it reaches to end of the file
		while(!((c=fread.read()) == -1)) {
			fwrite.write(c);
			
		}
		
		fwrite.close();
		fread.close();
		
		System.out.println("data copied");
	}

}
