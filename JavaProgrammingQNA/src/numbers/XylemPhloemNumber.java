package numbers;

public class XylemPhloemNumber {
	public static void main(String[] args) {
		int no=92345;
		int temp=no;
		
		int ld=no%10;
		int fd=temp/10;
		int idsum=0;
		while (fd>9) {
			int r=fd%10;
			idsum=idsum+r;
			fd=fd/10;
		}
		System.out.println(ld+"  "+fd+"  "+idsum);
		int odsum=ld+fd;
		if (odsum==idsum) {
			System.out.println("xylm");
		}else {
			System.out.println("phloen");
		}
		
	}
}
