package arrays;

public class PalindromeArrays2 {

	public static void main(String[] args) {
		int[] a1= {1, 2, 3, 2, 1};
//		int[] a1 = {1, 2, 3, 4};
		
		int i=0;
		int j=a1.length-1;
		while (i<j) {
			System.out.println("2nd "+i+" "+j);
			if (a1[i]!=a1[j]) {
				System.out.println("not Palindrome");
				break;
			}
			i++;
			j--;
			System.out.println(i+" "+j);
		}
		System.out.println("Palindrome");
	}

}
