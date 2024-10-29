package simple;

import java.util.HashMap;
import java.util.Map;

public class FreqChar {
	public static void main(String[] args) {
		String str = "abbccc";
		String s=RemoveDuplicates(str);
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			char ch1=s.charAt(i);
			int c=0;
			for(int j=0;j<str.length();j++) {
				char ch2=str.charAt(j);
				if(ch1==ch2) {
					c++;
				}
			}
			System.out.println(ch1 +":"+ c);
		}
		
		//using collections 
		String input = "hello";
	    Map<Character, Integer> frequencyMap = new HashMap<>();

	    for (char c : input.toCharArray()) {
	       frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	    }

	    System.out.println("using collections:");
	    for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	       System.out.println(entry.getKey() + ": " + entry.getValue());
	    }
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
