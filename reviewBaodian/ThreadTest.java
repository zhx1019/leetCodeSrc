package reviewBaodian;


class MyThread extends Thread {
	public static int index;
	public static Object obj = new Object();
	public void run()
	{
		synchronized(obj){
			for(int i = 0; i < 100; i++)
			{
				System.out.println(getName() + ": " + index++);
			}
		}
	}
}

class MyThread1 implements Runnable {
	public void run()
	{
		
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
