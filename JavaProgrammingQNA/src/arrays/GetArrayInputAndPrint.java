package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GetArrayInputAndPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input array size");
		int size=sc.nextInt();
		int[] A1=new int[size];
		for (int i = 0; i < size; i++) {
			A1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(A1));
	}

}
