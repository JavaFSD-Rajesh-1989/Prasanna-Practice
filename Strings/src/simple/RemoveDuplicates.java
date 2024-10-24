package simple;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
//		String str= "kilikilkil";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("enter string");
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!(res.contains(ch+""))) {
				res=res+ch;
			}
		}
		System.out.println(res);
	}
}
