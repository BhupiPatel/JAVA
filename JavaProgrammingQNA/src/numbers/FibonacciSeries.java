package numbers;

public class FibonacciSeries {

	public static void main(String[] args) {
//		while loop
		int no=10;
		int a=0;
		int b=a+1;
		while (no>0) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			no--;
		}
//		for loop
		int no1=10;
		int a1=0;
		int b1=a1+1;
		for (int i = 0; i < no1; i++) {
			System.out.println(a1);
			int c=a1+b1;
			a1=b1;
			b1=c;
		}
	}
}
