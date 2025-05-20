package arrays;

public class AverageOfAnArray {

	public static void main(String[] args) {
//		Average is sum of all the no. divided by the total no. 
		int[] ar= {1,2,3,4,5};
		int sum=0;
//		Calculate the sum of all no
		for (int i : ar) {
			sum=sum+i;
		}
//		divided by the total no.
		int av=sum/ar.length;
		System.out.println(av);
	}

}
