package numbers;

public class SpyNumber {
	
//	spy no = 1124, 123, 1412
	
	public static void main(String[] args) {
		int no=1124;
		int sum=0;
		int prod=1;
		while (no>0) {
			int r=no%10;
			sum=sum+r;
			prod=prod*r;
			no=no/10;
		}
		System.out.println(sum+" "+prod);
	}

}
