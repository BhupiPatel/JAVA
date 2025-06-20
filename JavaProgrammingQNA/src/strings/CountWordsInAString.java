package strings;

public class CountWordsInAString {

	public static void main(String[] args) {
		String s="Bhupi bhai is learning Java like a beast";
		int count=0;
		if (s.charAt(0)!=' ') {
			count++;
		}
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
//		2nd
		String[] words=s.trim().split("\\s");
		System.out.println(words.length);
		
	}

}
