package cure;

public class Search {
	
	public static void main(String[] args) {
		int arr[] = new int [] {8,9,4,5,3,2,6,1};
		
		System.out.println(SearchElement(arr,11));
	}
	
	public static int SearchElement(int [] arr,int x) {
		int a =-1;
		for(int i = 0; i<arr.length;i++) {
			if(x == (arr[i])) {
				a=i;
				break;
			}
		}
		return a;
	}
}
