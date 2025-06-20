package strings;

public class SwapFirstLastWordsInASentence {

	public static void main(String[] args) {
		String s="Java is super powerful";
		String[] sa=s.split(" ");
		String temp=sa[0];
		sa[0]=sa[sa.length-1];
		sa[sa.length-1]=temp;
		String n=String.join(" ", sa);
		System.out.println(n);
	}

}
