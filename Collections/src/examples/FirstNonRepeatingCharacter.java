package examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
public static void main(String[] args) {
	String s="baassfff";
	Map<Character, Integer> nonRepeat = new LinkedHashMap<>();
	for(char ch : s.toCharArray()) {
		nonRepeat.put(ch, nonRepeat.getOrDefault(ch, 0)+1);
	}
	System.out.println(nonRepeat.toString());
	for(Map.Entry<Character, Integer> entry : nonRepeat.entrySet()) {
		if(entry.getValue() == 1) {
			System.out.println(entry.getKey());
		}
	}
}
}
