class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName() 
                                + " in control"); 
			
		}
	}
}

class fourth
{
	public static void main(String []args)
	{
		MyThread m= new MyThread();
		m.start();
		for(int i=0;i<100;i++)
		{
		System.out.println(Thread.currentThread().getName() 
                                + " in control"); 
                Thread.yield();
		}
           
		
	}
}