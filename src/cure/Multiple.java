package cure;

import java.util.Scanner;

public class Multiple {
	
	public static void main(String[] args) {
		System.out.println("收入数字:");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		boolean n = false;
		boolean m = false;
		
		if(num%5==0) {
			System.out.println("这个数为5的倍数");
			n = true;
		}
		if(num%2==0) {
			System.out.println("这个数为2的倍数");
			m = true;
		}
		if(n == false && m == false) {
			System.out.println("既不是5的倍数也不是2的倍数");
		}
		
	}
}
