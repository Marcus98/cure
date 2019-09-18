package cure;

public class SumOfArray {
	
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{2,3,4},{5,6,7}};
		System.out.println(Sum(arr));
	}
	public static int Sum(int arr[][]) {
		
		int sum = 0 ;
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				sum += arr[i][j];
			}
		}
		
		return sum;
	}
}
