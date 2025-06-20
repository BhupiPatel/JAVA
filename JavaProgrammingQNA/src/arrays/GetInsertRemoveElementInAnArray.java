package arrays;

import java.util.Arrays;

public class GetInsertRemoveElementInAnArray {

	public static void main(String[] args) {
		int[] a=new int[10];
		a[5]=4;//add
		System.out.println(a[5]);//get
		System.out.println(Arrays.toString(a));
		a[5]=5;//remove & insert
		System.out.println(Arrays.toString(a));
	}

}
