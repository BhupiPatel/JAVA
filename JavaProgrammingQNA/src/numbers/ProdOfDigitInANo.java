package numbers;

public class ProdOfDigitInANo {

	public static void main(String[] args) {
		int no=55;
		int prod=1;
		while (no>0) {
			int r=no%10;
			prod=prod*r;
			no=no/10;
		}
		System.out.println(prod);
	}

}
