class Thread1 extends Thread
{
public void run()
{
for(int i=0;i<100;i++)
{
System.out.println(Thread.currentThread().getName() + " in control"); 
}
}
}
class Hello
{
public static void main(String[] args)
{
Thread1 e=new Thread1();
e.start();
try
{
e.join();
}
catch(Exception k)
{


}
for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName() 
                                + " in control"); 
			
		}
}
}
