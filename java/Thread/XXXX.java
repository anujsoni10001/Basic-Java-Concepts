class A extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
System.out.println("Thread A"+i);	
}
}
class B extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
System.out.println("Thread B"+i);	
}
}
class C extends Thread
{
public void run()
{
int i=3;
System.out.println("Thread C"+i);	
}
}
class Demo
{
public static void main(String[] args)
{
A a1=new A();
a1.start();
B b1=new B();
C c1=new C();
c1.start();
b1.start();
}	
}