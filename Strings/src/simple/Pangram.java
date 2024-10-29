package simple;

import java.util.HashSet;
import java.util.Set;

//PANGRAM : the sentence contains all 26 alphabets a to z
public class Pangram {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		String s = str.toLowerCase();
		Set<Character> pangram = new HashSet<>();
		for(char ch : s.toCharArray()) {
			if(ch>='a'&&ch<='z') {
				pangram.add(ch);
			}
		}
		if(pangram.size() == 26) {
			System.out.println("its a pangram");
		}
	}

}
