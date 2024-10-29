package simple;

public class RemoveVowels {
	public static void main(String[] args) {
		String str = "Good Afternoon";
		String s=str.toLowerCase();
		System.out.println(s.replaceAll("[a,e,i,o,u]", ""));
		
	}

}
