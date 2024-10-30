package examples;

public class MaxDiffBwEle {
	public static void main(String[] args) {
		int[] a = {2, 3, 10, 6, 4, 8, 1};
		int diff=0;
		int max=0;
		for(int i=0;i<a.length-1;i++) {
//			diff=a[i]-a[i+1];
			diff=Math.max(max, a[i]-a[i+1]);
			if(diff>max) {
				max=diff;
			}
		}
		System.out.println(max);
		
		//Find the Maximum Difference between Two Elements in an Array
//		Problem: Given an array, find the maximum difference between two 
//		elements where the larger element comes after the smaller one.
//		int maxDiff=Integer.MIN_VALUE;
		int maxDiff=0;
		int minEle = a[0];
		for(int i=0;i<a.length-1;i++) {
			maxDiff=Math.max(maxDiff, a[i]-minEle);
//			System.out.println(maxDiff);
			minEle=Math.min(minEle, a[i]);
		}
		System.out.println(maxDiff);
	

	
	//checking whether the array is sorted
	int[] arr = {2,5,6,9,11};
	System.out.println(checkSorted(arr));
}

	public static boolean checkSorted(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
