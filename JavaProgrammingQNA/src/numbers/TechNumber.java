package numbers;

public class TechNumber {

	public static void main(String[] args) {
		int no=2025;
		int temp=no;
		int count=0;
		while (temp>0) {
			int r=temp%10;
			temp=temp/10;
			count++;
		}
		System.out.println(count);
		if (count%2==0) {
			System.out.println("Even");
//			String noS=String.valueOf(no);
//			String part1 = no.substring(0, noS.length() / 2);
//		    String part2 = no.substring(noS.length() / 2);
//		    int fno = Integer.parseInt(part1);
//		    int sno = Integer.parseInt(part2);
//		    int sum=fno+sno;
		} else {
			System.out.println("Odd");
		}
	}

}
