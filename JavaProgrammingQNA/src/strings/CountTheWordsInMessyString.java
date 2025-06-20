package strings;

public class CountTheWordsInMessyString {
	public static void main(String[] args) {
		String s="  ___java*& ^--__is_ _fun\r\n" ;
		s=s.replaceAll("[^a-zA-Z]", " ");
		s=s.trim().replaceAll("\\s+", " ");
		System.out.println(s);
		int count=s.split(" ").length;
		System.out.println(count);
	}
}
