package strings;

public class ReverseLastWord {

	public static void main(String[] args) {
		String s="Java is powerful";
		String[] sa=s.split(" ");
		String lw=sa[sa.length-1];
		String rev="";
		for (int i = lw.length()-1; i >= 0; i--) {
			rev=rev+lw.charAt(i);
		}
		sa[sa.length-1]=rev;
		String l=String.join(" ", sa);
		System.out.println(l);
	}

}
