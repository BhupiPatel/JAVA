package numbers;

public class SumOfDigitInANo {

	public static void main(String[] args) {
		int no=123;
		int sum=0;
		while (no>0) {
			int r=no%10;
			sum=sum+r;
			no=no/10;
		}
		System.out.println(sum);
	}

}
