class Thread1 extends Thread
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
class Hello
{
public static void main(String[] args)
{
Thread1 t=new Thread1();///New Thread Created...
t.start();// New Thread Starts 
          // Thread Moves from New State to Runnable State
}
}