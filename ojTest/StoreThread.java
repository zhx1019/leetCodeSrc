package ojTest;

public class StoreThread {
	private final int MAX_SIZE;
	private int count;
	public StoreThread(int n)
	{
		MAX_SIZE = n;
		count = 0;
	}
	
	public synchronized void add()
	{
		while(count >= MAX_SIZE)
		{
			System.out.println("filled");
			try 
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		count++;
		
		System.out.println(Thread.currentThread().toString()+" put "+count);
		this.notifyAll();
	}
	
	public synchronized void remove()
	{
		while(count <= 0)
		{
			System.out.println("empty");
			try 
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		
		count--;
		System.out.println(Thread.currentThread().toString()+" get "+count);
		
		this.notify();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreThread s = new StoreThread(5);
		Thread pro1 = new Producer(s);
		Thread pro2 = new Producer(s);
		Thread con = new Consumer(s);
		Thread con2 = new Consumer(s);
		pro1.setName("pro");
		pro2.setName("pro2");
		con.setName("con");
		con2.setName("con2");
		pro1.start();
		pro2.start();
		con.start();
		con2.start();
	}

}

class Producer extends Thread {
	private StoreThread s;
	public Producer(StoreThread s)
	{
		this.s = s;
	}
	
	public void run()
	{
		while(true)
		{
			s.add();
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	private StoreThread s;
	public Consumer(StoreThread s)
	{
		this.s = s;
	}
	
	public void run()
	{
		while(true)
		{
			s.remove();
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
