package arrays;

public class FindElementUsingBinarySearchTechnique {

	public static void main(String[] args) {
		int[] a = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int no=2;
		int low=0;
		int high=a.length-1;
		while (low<=high) {
			System.out.println(low+" low/high "+high);
			int mid=(low+high)/2;
			System.out.println("mid "+mid);
			if (a[mid]==no) {
				System.out.println(no+" found "+mid);
				break;
			}else if (a[mid]<no) {
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
	}

}
