// Overriding 
class A
{
public static void hello()
{
System.out.println("From..Parent Hello");
}
}
class B extends A
{
protected static void hello()
{
System.out.println("From..Child Hello");
}
public static void main(String[] args)
{
B b1=new B();
b1.hello();
}
}
