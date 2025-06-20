package arrays;

public class FindElementUsingLinearSearchTechnique {

	public static void main(String[] args) {
		int[] a= {1,4,6,8,43,7,4,};
		for (int i = 0; i < a.length; i++) {
			if (43==a[i]) {
				System.out.println("Found at "+i);
			}
		}
	}

}
