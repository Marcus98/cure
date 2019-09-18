package cure;

import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {

		int trueNum = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);

		int num = 101;
		while(num != trueNum){
			System.out.println("请输入一个0-100的数字:");
			num = scanner.nextInt();
			if(num<trueNum) {
				System.out.println("小了");
			}
			if(num>trueNum) {
				System.out.println("大了");
			}if(num == trueNum) {
				System.out.println("正确 ");
			}
		}
	}
}

