package strings;

public class ReplaceJunkSpecialChar {

	public static void main(String[] args) {
		String s= "Bhupi@#123^&Patel!!";
		String s1=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s1);
	}

}
