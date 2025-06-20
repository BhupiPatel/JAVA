package strings;

public class CountVowelsConsonantsSpecialCharNo {
	public static void main(String[] args) {
		String s = "Bhupi@123#Java!";
		s=s.toLowerCase();
		int vowels=0;
		int con=0;
		int sc=0;
		int no=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if ("aeiou".indexOf(ch)!=-1) {
					vowels++;
				}else {
					con++;
				}
			}else if (Character.isDigit(ch)) {
				no++;
			}else if (!Character.isWhitespace(ch)) {
				sc++;
			}
		}
		System.out.println(vowels+" "+con+" "+sc+" "+no);
		System.out.println("aeiou".indexOf('d'));
	}
}
