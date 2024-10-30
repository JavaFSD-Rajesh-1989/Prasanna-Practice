package examples;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {8,4,7,2,9,1};
		int l=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		System.out.println(l);
		for(int n : arr) {
			if(n>l) {
				sl=l;
				l=n;
			}else if(n>sl) {
				sl=n;
			}
		}
		System.out.println(sl);
	}
}