package numbers;

public class ProdOfDigitOfANo {

	public static void main(String[] args) {
		int no=12345;
		int prod=1;
		while (no>0) {
			int r=no%10;
			prod=prod*r;
			no= no/10;
		}
		System.out.println(prod);
	}

}
