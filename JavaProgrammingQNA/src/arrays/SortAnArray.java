package arrays;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int[] ar= {1,2,3,48,7,64,654,0,4,2,7};
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[i]<ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
							;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
