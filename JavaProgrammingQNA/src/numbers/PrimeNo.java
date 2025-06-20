package numbers;

import java.util.Iterator;

public class PrimeNo {

//	1 to 100
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			boolean b=true;
			for (int j = 2; j < i; j++) {
				if (0==i%j) {
					b=false;
				}
			}
			if (b) {
				System.out.println(i);
			}
		}
	}

}
