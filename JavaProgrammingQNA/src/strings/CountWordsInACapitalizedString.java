package strings;

public class CountWordsInACapitalizedString {

	public static void main(String[] args) {
		String s="Hello Bhi Patel To The World";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
		int count2=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				count2++;
			}
		}
		System.out.println(count2);
	}

}
