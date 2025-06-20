package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		s1=s1.replace("\\s", "").toLowerCase();
		s2=s2.replace("\\s", "").toLowerCase();
		if (s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			System.out.println(Arrays.equals(c1, c2));
		}
	}

}
