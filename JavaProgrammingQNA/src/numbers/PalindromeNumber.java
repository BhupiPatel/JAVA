package numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		int no=121;
		int temp=no;
		int rev=0;
		 while (no>0) {
			int r=no%10;
			System.out.println("r "+r);
			rev=(rev*10)+r;
			System.out.println("rev "+rev);
			no=no/10;
		}
		 System.out.println("rev "+rev+", no "+temp);
		 if (rev==temp) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
