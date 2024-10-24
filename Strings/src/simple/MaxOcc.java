package simple;

public class MaxOcc {
	public static void main(String[] args) {
		String s="knklnllll";
		String str = remDup(s);
		int maxCount=0;
		char maxCh=' ';
		for(int i=0;i<str.length();i++) {
			int count=0;
			char ch=str.charAt(i);
			for(int j=0;j<s.length();j++) {
				char ch2=s.charAt(j);
				if(ch==ch2) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxCh=ch;
			}
		}
		System.out.println(maxCh);
	}

	private static String remDup(String s) {
		// TODO Auto-generated method stub
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
