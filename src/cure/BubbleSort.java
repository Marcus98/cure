package cure;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int Array[] = new int[] {5,8,9,3,1,4};
		int temp;
		
		for(int i = 0; i<Array.length; i++) {
			
			System.out.print(Array[i]);
		}
		
//		for(int i = 0; i<Array.length-1; i++) {
//			for(int j = 0;j<Array.length-1;j++) {
//				if(Array[j]>Array[j+1]) {
//					temp = Array[j];
//					Array[j]=Array[j+1];
//					Array[j+1]=temp;
//				}
//			}
//		}
		System.out.println("");
//		for(int i = 0; i<Array.length; i++) {
//			System.out.print(Array[i]);
//		}
		
		Arrays.sort(Array);
		for(int i = 0; i<Array.length; i++) {
			System.out.print(Array[i]);
		}
	}
}
