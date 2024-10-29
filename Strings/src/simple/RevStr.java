package simple;

public class RevStr {
	public static void main(String[] args) {
		String s="i am java";
		System.out.println("by writing rev method: "+reverse(s));  
		
		//converting to char array
		char [] ar=s.toCharArray();
		System.out.println("convert to char arr:");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]);
		}
		System.out.println();
		
		
		StringBuilder sb=new StringBuilder(s);
//		sb.append(s);
		System.out.println("by string builder and in built methods:"+sb.reverse());
		
//		STRING BUFFER
		StringBuffer sbuffer=new StringBuffer(s);
		System.out.println("string buffer:"+sbuffer.reverse());
		
	
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev += ch;
		}
		return rev;
	}

}
