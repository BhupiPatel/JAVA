package arrays;

public class DistinctElements {
	
//	input {4, 5, 4, 2, 1, 5, 2}
//	output {4, 5, 2, 1}

	public static void main(String[] args) {
		int[] a= {1,4,6,6,8,43,7,1,8,4,};
		for (int i = 0; i < a.length; i++) {
			boolean d=true;
//			System.out.println("i "+i);
			for (int j = 0; j < i; j++) {
//				System.out.println("j "+j);
				if (a[i]==a[j]) {
					d=false;
					break;
				}
			}
			if (d) {
				System.out.println(a[i]+" Distinct Element");
			}
		}
	}

}