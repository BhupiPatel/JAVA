package arrays;

import java.util.Arrays;

public class PalindromeArrays1 {

	public static void main(String[] args) {
		int[] a1= {1, 2, 3, 2, 1};  // Same forwards and backwards ✔️
//		int[] a1 = {1, 2, 3, 4}; // Reversed is {4, 3, 2, 1} ❌
		int[] a2=new int[a1.length];
		int ab=0;
		for (int i = a1.length-1; i >= 0 ; i--) {
			a2[ab]=a1[i];
			ab++;
		}
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.equals(a1, a2));
	}

}
