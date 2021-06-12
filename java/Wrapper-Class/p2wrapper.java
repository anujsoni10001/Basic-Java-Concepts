class A
{
public static void main(String[] args)
{
int i=100;
Integer iobj=Integer.valueOf(i);
Integer iobj1=i;//Autoboxing
System.out.println(iobj1+iobj);
System.out.println(i);
}	
}