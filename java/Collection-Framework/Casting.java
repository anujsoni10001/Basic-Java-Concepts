class A
{
	
}
class B extends A
{	
void Show()
{
System.out.println("Shows");	
}
public static void main(String[] args)
{	
B b1=new B();
A a1=(A)b1;//UPCASTING//
B b2=(B)a1;//DOWNCASTING////
b2.Show();
}
}