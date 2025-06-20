package arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a1 = {2, 4, 6, 7, 8};
		int left = 0;
        int right = a1.length - 1;

        while (left < right) {
            // Swap the elements
            int temp = a1[left];
            a1[left] = a1[right];
            a1[right] = temp;

            left++;
            right--;
        }
		System.out.println(Arrays.toString(a1));
	}

}
