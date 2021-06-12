class L extends Thread
{
public void run()
{
for(int i=0;i<=12;i++)
{
System.out.println("Thread L");	
}
}
}
class N extends Thread
{
public void run()
{
for(int j=0;j<=6;j++)
{
System.out.println("Thread N");		
}
}
}
class M
{
public static void main(String[] args) throws Exception
{
Thread t1=new Thread(new L());
Thread t2=new Thread(new N());
t1.setPriority(10);
t2.setPriority(10);
t1.start();
t2.start();
}	
}