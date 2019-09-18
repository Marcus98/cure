package cure;

import java.util.Arrays;

public class Max {
	public static void main(String[] args) {
		int [] arr = new int [] {9,8,6,2,4,3,1};
		FindMax(arr);
	}
	public static void FindMax(int arr[]) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
}
