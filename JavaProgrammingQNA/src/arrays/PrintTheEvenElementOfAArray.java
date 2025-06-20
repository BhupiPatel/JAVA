package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintTheEvenElementOfAArray {

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,7,8,9,0,1,11};
		int[] ar2=new int[12];
		List<Integer> ar3=new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2==0) {
				System.out.println("Even No. = "+i);
				ar3.add(ar[i]);
			}
		} 
		System.out.println(ar3);
	}

}