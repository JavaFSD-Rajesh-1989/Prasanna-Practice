package examples;

import java.util.Arrays;
import java.util.Comparator;

//Sort an Array of Strings Based on Length
//Sort an array of strings based on the length of each string in ascending order
public class SortStrLength {
	public static void main(String[] args) {
		String[] arr = {"Helo","today","is","Monday"};
		Arrays.sort(arr,Comparator.comparingInt(String::length));
		System.out.println(Arrays.toString(arr));
		
		
	}

}
