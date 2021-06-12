class A
{
final int x=4;
final void m1()
{
System.out.print("Base Class"+x);
}
}
class B extends A
{
public static void main(String[] v)
{
B b1=new B();
b1.m1();
}
}
