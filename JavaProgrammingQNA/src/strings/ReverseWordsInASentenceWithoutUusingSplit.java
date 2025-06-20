package strings;

public class ReverseWordsInASentenceWithoutUusingSplit {

	public static void main(String[] args) {
		String s="Java is powerful";
		String result = "";
	    String word = "";
	    
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch!=' ') {
				word=word+ch;
			}else {
				for (int j = word.length()-1; j >= 0; j--) {
					result=result+word.charAt(j);
				}
				result+=" ";
				word="";
			}
		}
		// Reverse the last word (since no space after it)
        for (int j = word.length() - 1; j >= 0; j--) {
            result += word.charAt(j);
        }
		System.out.println(result);
	}

}
