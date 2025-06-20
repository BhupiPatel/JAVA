package arrays;

import java.util.Arrays;

public class FindMisssingNoinanArray {

	public static void main(String[] args) {
		int[] ar= {1,2,4,5};
		int sum1=0;
		for (int i : ar) {
			sum1=sum1+i;
		}
		Arrays.sort(ar);
		int sum2=0;
		for (int i = 0; i <= ar[ar.length-1]; i++) {
			sum2=sum2+i;
		}
		int missNo=sum2-sum1;
		System.out.println(missNo);
	}

}
