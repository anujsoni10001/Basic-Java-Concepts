class Join extends Thread
{
public void run()
{
for(int i=1;i<1000;i++)
{
System.out.println("Child Thread..");
try
{
J.join();
}
catch(Exception e)
{

}
}
}
}
class fifth
{
public static void main(String []args)
{
Join J=new Join();
J.start();

for(int i=1;i<1000;i++)
{
System.out.println("Main Thread..");
}
}
}