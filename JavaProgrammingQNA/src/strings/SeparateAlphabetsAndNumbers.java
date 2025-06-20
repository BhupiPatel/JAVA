package strings;

public class SeparateAlphabetsAndNumbers {

	public static void main(String[] args) {
		String s = "Bhupi123Patel456";
		String s1="";
		String s2="";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				s1=s1+s.charAt(i);
			} else if (Character.isDigit(s.charAt(i))) {
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s1+" "+s2);
	}

}