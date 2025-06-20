package strings;

public class SumOfDigitsInAString {

	public static void main(String[] args) {
		String str = "Bhupi123Patel456";
		int l=str.length()-1;
		int sum=0;
		while (l>0) {
			if (Character.isDigit(str.charAt(l))) {
				System.out.println(str.charAt(l));
				sum=sum+str.charAt(l)-'0';
				System.out.println("sum "+sum);
			}
			l--;
		}
		System.err.println(sum);
	}

}
