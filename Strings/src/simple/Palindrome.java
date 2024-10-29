package simple;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPalindrome(str));
	}
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!= str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
