package numbers;

public class FirstDigitIsEvenOrOdd {
	public static void main(String[] args) {
		int no=2345;
		int firstDigit=0;
		while (no>0) {
			firstDigit=no%10;
			no=no/10;
		}
		if (firstDigit%2==0) {
			System.out.println(firstDigit+" is a even no");
		}else {
			System.out.println("odd");
		}
	}

}
