package cure;

public class SumOfEnum {
	public static void main(String[] args) {
		int arr[] = new int [] {1,2,3,4,5,6,7,8,9};
		System.out.println(Sum(arr));
	}
	public static int Sum (int arr[]) {
		int sum = 0;
		for(int i =0 ; i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
}
