package numbers;

public class LargestSmallestDigitInANumber {

	public static void main(String[] args) {
		int no=7644936;
		int high=0,low=10;
		while (no>0) {
			int r=no%10;
			if (r>high) {
				high=r;
			}
			if (r<low) {
				low=r;
			}
			no=no/10;
		}
		System.out.println(high+"  "+low);
	}

}
