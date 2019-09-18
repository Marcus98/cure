package cure;

import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		
		System.out.println("ÊäÈë·ÖÊý£º");
		Scanner sc = new Scanner(System.in);		
		int score = sc.nextInt();
		
		if(score>=90 && score<=100) {
			System.out.println("A");
		}
		if(score>=80 && score<=89) {
			System.out.println("B");
		}
		if(score>=70 && score<=79) {
			System.out.println("C");
		}
		if(score>=60 && score<=69) {
			System.out.println("D");
		}
		if(score>=50 && score<=59) {
			System.out.println("E");
		}
        if(score>100||score<50) {
        	System.out.println("Error");
        }
		
	}
}
