package numbers;

public class Swap2NoWO3rdVariable {

	public static void main(String[] args) {
		int a=4,b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
