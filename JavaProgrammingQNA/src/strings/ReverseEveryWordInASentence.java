package strings;

public class ReverseEveryWordInASentence {
	public static void main(String[] args) {
		String s="Java is powerful";
		String[] sa=s.split(" ");
		String s1="";
		for (String i : sa) {
			String rev="";
			for (int j = i.length()-1; j >=0 ; j--) {
				rev=rev+i.charAt(j);
			}
			s1=s1+rev+" ";
		}
		System.out.println(s1);
	}
}
