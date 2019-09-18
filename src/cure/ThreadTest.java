package cure;

public class ThreadTest extends Thread{
	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest("T1");
		ThreadTest t2 = new ThreadTest("T2");
		t1.start();
		t2.start();
 	}
	
	public void run() {
		print();
	}
	
	public ThreadTest(String name) {
		super(name);
	}
	public void print() {
		for(int i = 0; i < 10;i++) {
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName()+":"+i);
		}
	}
}
