package numbers;

public class HappyNo {

	public static void main(String[] args) {
		int no=19;
		int hn=0;
		while (no!=1) {
			int sum=0;
			while (no>0) {
				int r=no%10;
				sum=(r*r)+sum;
				no=no/10;
			}
			System.out.println(no);
		}
	}

}
