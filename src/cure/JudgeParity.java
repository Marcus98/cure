package cure;

import java.util.Scanner;

public class JudgeParity {
	
	public static void main(String[] args) {
		System.out.println("�������֣�");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num % 2 !=0) {
			System.out.println("����");
		}else {
			System.out.println("ż��");
		}
	}
}
