///For Unchecked Exceptions///
class Ex
{
int a=32;
int b=0;
void m1()
{
int c=a/b;	
}
public static void main(String[] args)
{
/// Unchecked Exceptions ///
///Trying To Handle These Unchecked Exceptions///
try
{
new Ex().m1();
}
///Exception e is a superclass of all the  Exceptions in java// 
///In compile Time This Exception has been already Caught///
catch(ArithmeticException e)
{
System.out.println("Cannot Divide by Zero");
}
catch(Exception e)
{
System.out.println("Cannot Divide by Zero");
}
}
}