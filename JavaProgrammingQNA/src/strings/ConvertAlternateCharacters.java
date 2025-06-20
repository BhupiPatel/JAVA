package strings;

public class ConvertAlternateCharacters {

	public static void main(String[] args) {
		String s1 = "bhupipatel123";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (i % 2 == 0) {
				s2=s2+Character.toUpperCase(ch);
			} else {
				s2=s2+Character.toLowerCase(ch);
			}
		}
		System.out.println(s2);
	}

}
