package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CopyTwoArrayInSingleArray {

	public static void main(String[] args) {
		int[] a1= {1,2,3};
		int[] a2= {4,5,6,7,8,9};
		int[] a3=new int[a1.length+a2.length];
		for (int i = 0; i < a1.length; i++) {
			a3[i]=a1[i];
		}
		System.out.println(Arrays.toString(a3));
		for (int i = 0; i < a2.length; i++) {
			a3[a1.length+i]=a2[i];
		}
		System.out.println(Arrays.toString(a3));
		
		int[] merged = IntStream.concat(IntStream.of(a1), IntStream.of(a2)).toArray();
		System.out.println(Arrays.toString(merged));
	}

}
