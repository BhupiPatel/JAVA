package numbers;

public class ArmstrongNo {

	public static void main(String[] args) {
		int no=153;
		int sum=0;
		while (no>0) {
			int r=no%10;
			sum=sum+(r*r*r);
			no=no/10;
		}
		System.out.println(sum);
		if (sum==no) {
			System.out.println("Armstron no");
		}else {
			System.out.println("Not");
		}
	}

}
