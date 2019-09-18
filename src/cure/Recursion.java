package cure;

public class Recursion {
	public static void main(String[] args) {
		System.out.println(RecursionMethod(100));
	}
	public static int RecursionMethod(int i) {
		
		int sum ;
		if(i == 1) {
			return 1;
		}else {
			sum = i +RecursionMethod(i-1);
		}
		
		return sum;
	}
}
