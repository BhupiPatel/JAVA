package strings;

public class FindLongestWordFromASentence {

	public static void main(String[] args) {
		String s = "Java is an object oriented programming language";
		String[] sa=s.split(" ");
		String lw="";
		int max=0;
		for (String i : sa) {
			System.out.println(i);
			int l=i.length();
			if (l>max) {
				max=l;
				lw=i;
			}
		}
		System.out.println(lw+" "+max);
	}

}
