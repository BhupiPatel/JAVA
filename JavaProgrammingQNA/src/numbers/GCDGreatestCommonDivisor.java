package numbers;

public class GCDGreatestCommonDivisor {

	public static void main(String[] args) {
		int n1=20;
		int n2=30;
		int gdc=0;
		for (int i = 1; i <= 10; i++) {
			if (n1%i==0 && n2%i==0) {
				System.out.println(i);
				gdc=i;
			}
		}
		System.out.println(gdc);
	}

}
