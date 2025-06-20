package arrays;

import java.util.Arrays;

public class CopyTwoArrayInSingleArrayZIGZAG {

	public static void main(String[] args) {
		int[] a = {1, 3, 5};
		int[] b = {2, 4, 6, 7, 8};
		int[] c = new int[a.length+b.length];
		int t1=0,t2=0,i=0;
		while (i<c.length) {
			if (t1<a.length) {
				c[i++]=a[t1++];
			}
			if (t2<b.length) {
				c[i++]=b[t2++];
			}
		}
		System.out.println(Arrays.toString(c));
	}

}