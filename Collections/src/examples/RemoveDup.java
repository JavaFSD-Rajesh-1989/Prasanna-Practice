package examples;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup {
	public static void main(String[] args) {
	       Integer[] arr = {1, 2, 2, 3, 4, 4, 5};
	      Set<Integer> uniqueSet = new LinkedHashSet<Integer>(Arrays.asList(arr));
	       System.out.println(uniqueSet);
	       Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);
	      System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
	
		}
}