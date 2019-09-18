package cure;

public class Afunction {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int x = add(a,b);
		System.out.println(x);
		
		int y = getMax(a,b);
		System.out.println(y);
	}
	
	public static int add(int x ,int y){
		
		int result = x+y;
        return result;
	}
	public static int getMax(int x,int y) {
		int	max;
		if(x>y) {
			max=x;
		}else {
			max=y;
		}

		return max;
	}
}
