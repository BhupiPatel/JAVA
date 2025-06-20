package numbers;

public class Print1to100WOLoop {
	
	public static void print(int n1,int n2) {
		if (n1<=n2) {
			System.out.println(n1);
			n1++;
			print(n1,n2);
		}
	}

	public static void main(String[] args) {
		print(1,10);
	}

}
