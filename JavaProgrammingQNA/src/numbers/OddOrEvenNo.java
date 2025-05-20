package numbers;

import java.util.Scanner;

public class OddOrEvenNo {

	public static void main(String[] args) {
//		to get the data from the user need to use Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No.");
		int n=sc.nextInt();
//		if its divided by 2 and the reminder is 0 its even no. otherwise its odd no.
		if (n%2==0) {
			System.out.println("Even no.: "+n);
		}else {
			System.out.println("Not an even no.: "+n);
		}
		
	}

}
