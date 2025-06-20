package numbers;

import java.util.Iterator;

public class StrongNumber {

	public static void main(String[] args) {
		int no=145;
		int sum=0;
		while (no>0) {
			int r=no%10;	
			int  fact=1;
			for (int i = 1; i <= r; i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		System.out.println(sum);
	}

}
