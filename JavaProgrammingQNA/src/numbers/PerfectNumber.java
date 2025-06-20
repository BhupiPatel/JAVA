package numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		int no=6;
		int sum=0;
		for (int i = 1; i < no; i++) {
			if (no%i==0) {
				sum=sum+i;
			}
		}
		System.out.println(no+" "+sum);
		if (no==sum) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("No");
		}
	}

}
