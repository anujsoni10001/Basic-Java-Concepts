abstract class A
{
abstract void m1();
void m2()
{
System.out.println("Hello How are u");
System.out.println("I am Fine");
}
}
class B extends A
{
void m1()
{
m2();
}
public static void main(String[] args)
{
new B().m1();
}
}