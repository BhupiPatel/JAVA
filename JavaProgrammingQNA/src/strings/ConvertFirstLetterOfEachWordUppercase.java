package strings;

public class ConvertFirstLetterOfEachWordUppercase {

	public static void main(String[] args) {
		String s="java is super powerful";
		String result = "";
        boolean capitalizeNext = true;
        s=s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	if (ch==' ') {
				result+=ch;
				capitalizeNext = true;
            } else if (capitalizeNext) {
                result += Character.toUpperCase(ch);
                capitalizeNext = false;
            } else {
                result += ch;
			}
		}
        System.out.println("Title Case: " + result);
	}
}