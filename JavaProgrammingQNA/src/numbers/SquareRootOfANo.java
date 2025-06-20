package numbers;

public class SquareRootOfANo {
	public static void main(String[] args) {
		int no=25;
		int sq=0;
		for (int i = 1; i < no; i++) {
			if (i*i==25) {
				System.out.println(i);
				break;
			}
		}
	}
}
