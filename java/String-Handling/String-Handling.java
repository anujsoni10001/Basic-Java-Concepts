class A
{
public static void main(String[] args)
{
System.out.println("First Line of Main");
int a,b,c;
a=10;
b=0;
try
{
c=a/b;
System.out.println(" Division is "+c);
}
catch(Exception e)
{
e.printStackTrace();
System.out.println("Cant be Divided By Zero");
}
System.out.println("Last Line of main");
}
}