package numbers;

public class SunnyNumber {

	public static void main(String[] args) {
		int no=15;
		int next=no+1;
		for (int i = 1; i < next; i++) {
			if (i*i==next) {
				System.out.println(no+" is a sunny no");
			}
		}
	}

}
