package arrays;

import java.util.Arrays;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		int[] ar= {9,6,3,4,5};
		int[] ar2= new int[ar.length];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i]=ar[i];
		}
		System.out.println(Arrays.toString(ar2));
		int[] ar3=ar.clone();
		Arrays.sort(ar3);// original stays intact
		System.out.println("Clone "+Arrays.toString(ar3));
	}

}
