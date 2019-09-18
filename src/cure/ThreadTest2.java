package cure;

public class ThreadTest2  {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		Thread t2 = new Thread(new MyRunnable());
		t2.start();
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable");
		
	}
	
}
class MyThread extends Thread{
	public void run() {
		System.out.println("Thread");
	}
}