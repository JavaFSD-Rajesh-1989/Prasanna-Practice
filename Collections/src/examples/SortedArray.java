package examples;

import java.util.Arrays;

public class SortedArray {
	   public static void main(String[] args) {
	       int[] arr = {1, 2, 3, 4, 5};
	       boolean isSorted = isArraySorted(arr);
	      System.out.println("Is the array sorted? " + isSorted);
	      
	      //sorting using arrays cls
	      int[] arr2 = {5,3,7,9,0,1};
			Arrays.sort(arr2);
			System.out.println(Arrays.toString(arr2));
			
		//sorting nrml way
			for(int i=0;i<arr2.length-1;i++) {
				for(int j=0;j<arr2.length-1;j++) {
					if(arr2[j]>arr2[j+1]) {
						int temp = arr2[j];
						arr2[j]=arr2[j+1];
						arr2[j+1]=temp;
					}
				}
			}
			for(int k=0;k<arr2.length;k++) {
				System.out.print(arr2[k]+" ");
			}
			
	   }
	 
	   public static boolean isArraySorted(int[] arr) {
	       for (int i = 1; i < arr.length; i++) {
	           if (arr[i] < arr[i - 1]) {
	               return false;
	           }
	       }
	       return true;
	   }
	   
	   
	}
