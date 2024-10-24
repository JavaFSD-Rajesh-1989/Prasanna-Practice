package simple;

public class MinOcc {
	public static void main(String[] args) {
		String s="bhhjjj";
		String res=RemoveDuplicates(s); 
		int minL= s.length();//6
		char minCh=' ';
		int count=0;
		for(int j=0;j<res.length();j++) {
			char ch2=res.charAt(j);
			for(int k=0;k<s.length();k++) {
				char ch3=s.charAt(k);
				if(ch2==ch3){
					count++;
//					System.out.println(count);
				}
			}
			if(count < minL) {
				minL=count;
//				System.out.println(minL);
				minCh=ch2;
			}
		}
		System.out.println(minCh);
	}

		

	public static String RemoveDuplicates(String s) {
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(res.contains(ch+""))) {
				res=res+ch;
			}
		}
		return res;
	}
	
}
