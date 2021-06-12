
 class JOINN  extends Thread{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("Child Thread");
		}
		try {Thread.sleep(1000);}
		catch(Exception ex) {}
	}

}
class fifth
{
	public static void main(String[] args) throws Exception {
		JOINN joinn = new JOINN();
		joinn.start();
		joinn.join(); 
		for(int i=0;i<1000;i++)
		{
			System.out.println("Main Thread");
		}
		
	}
}
