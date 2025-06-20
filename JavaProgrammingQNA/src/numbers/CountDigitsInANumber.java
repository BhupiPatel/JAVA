package numbers;

public class CountDigitsInANumber {

	public static void main(String[] args) {
		int no=1234;
		int count=0;
		while (no>0) {
			System.out.println("no "+no);
			no=no/10;
			System.out.println("no2 "+no);
			count++;
			System.out.println("count "+count);
		}
		System.out.println(count);
	}
}
