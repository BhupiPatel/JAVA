package numbers;

public class AutomorphicNumber {

	public static void main(String[] args) {
		int no=7;
		int sq=no*no;
		int ld=sq%10;
		System.out.println(no+" "+ld);
		if (no==ld) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("No");
		}
	}

}
