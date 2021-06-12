class Thread1 implements Runnable
{
public void run()
{
try
{
System.out.println("Thread is Created..");
}
catch(Exception e)
{
System.out.println("Exception is caught");
}
}
}
class D
{
public static void main(String[] args)
{
Thread t=new Thread(new Thread1());///New Thread Created...
t.start();// New Thread Starts 
t.start(); // Thread Moves from New State to Runnable State
}
}