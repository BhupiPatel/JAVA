package numbers;

public class NeonNo {

	public static void main(String[] args) {
		int no=9;
		int sq=no*no;
		int sum=0;
		while (sq>0) {
			int r=sq%10;
			sum=sum+r;
			sq=sq/10;
		}
		if (no==sum) {
			System.out.println("neon");
		}else {
			System.out.println("No");
		}
	}

}
