package cure;

import java.util.Scanner;

public class Multiple {
	
	public static void main(String[] args) {
		System.out.println("��������:");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		boolean n = false;
		boolean m = false;
		
		if(num%5==0) {
			System.out.println("�����Ϊ5�ı���");
			n = true;
		}
		if(num%2==0) {
			System.out.println("�����Ϊ2�ı���");
			m = true;
		}
		if(n == false && m == false) {
			System.out.println("�Ȳ���5�ı���Ҳ����2�ı���");
		}
		
	}
}
