package arrays;

public class FindMaxNMinValueOfAnArray {

	public static void main(String[] args) {
		int ar[]= {40,30,60,10,20,20,4};
		int max=0,min=ar[0];
		for (int i : ar) {
			if (i>max) {
				max=i;
			}else if (i<min) {
				min=i;
			}
		}
		System.out.println("Max value: "+max+"\n"+"Min value: "+min);
	}

}
