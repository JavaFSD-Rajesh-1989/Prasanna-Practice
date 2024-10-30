package examples;

public class MissingNum {
	public static void main(String[] args) {
		int[] ar = {5,2,1,0,4};
		int sum=0;
		int psum=(ar.length*(ar.length+1)/2);  //n*(n+1)/2 sum of 1st n natural num's
    	for(int num:ar) {
			sum+=num;
		}
		int res=psum-sum;
		System.out.println(res);
	}

}
