package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s1="madam";
		String s2="";
		for (int i = s1.length()-1; i >= 0; i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2.equals(s1));
		int left=0;
		int right=s1.length()-1;
		while (left<right) {
			if (s1.charAt(left)!=s1.charAt(right)) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			left++;
			right--;
		}
	}
}
