package cure;

import java.util.Arrays;

public class MaxAndMin {
	
	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,4,5};
		
		System.out.println(Add(arr));
		
	}
	public static int Add(int[]arr) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length-1];
		
		return min+max;	
	}
}
