package cure;

import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {

		int trueNum = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);

		int num = 101;
		while(num != trueNum){
			System.out.println("������һ��0-100������:");
			num = scanner.nextInt();
			if(num<trueNum) {
				System.out.println("С��");
			}
			if(num>trueNum) {
				System.out.println("����");
			}if(num == trueNum) {
				System.out.println("��ȷ ");
			}
		}
	}
}

