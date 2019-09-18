package cure;

import java.util.Scanner;

public class JudgeParity {
	
	public static void main(String[] args) {
		System.out.println("输入数字：");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num % 2 !=0) {
			System.out.println("奇数");
		}else {
			System.out.println("偶数");
		}
	}
}
