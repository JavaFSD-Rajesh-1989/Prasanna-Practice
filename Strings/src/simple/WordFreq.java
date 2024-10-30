package simple;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		String str = "Java is awesome and Java is fun";
		String[] s = str.split(" ");
		Map<String, Integer> wordC = new HashMap<>();
		for (String words : s) {
	           wordC.put(words, wordC.getOrDefault(words, 0) + 1);
	       }
	 
		int c=0;
		String minWord="";
	       for (Map.Entry<String, Integer> entry : wordC.entrySet()) {
	          System.out.println(entry.getKey() + ": " + entry.getValue());
	          //min occ
				if(entry.getValue()>c) {
				minWord = entry.getKey();
			    }
	       }
	       System.out.println(minWord);
			
		}

	}


