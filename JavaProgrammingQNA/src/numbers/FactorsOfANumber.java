package numbers;

public class FactorsOfANumber {

	public static void main(String[] args) {
		int no=12;
		for (int i = 1; i <= no; i++) {
			if (no%i==0) {
				System.out.println(i);
			}
		}
	}

}
