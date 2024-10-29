package simple;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		String str = "Java is awesome and Java is fun";
		String[] s = str.split(" ");
		Map<String, Integer> word = new HashMap<>();
		for(String words : s) {
			word.put(words, word.getOrDefault(word, 0)+1);
		}
		for(Map.Entry<String, Integer> entry : word.entrySet()) {
			System.out.println(entry.getKey()+ ":" +entry.getValue());
		}
	}

}
