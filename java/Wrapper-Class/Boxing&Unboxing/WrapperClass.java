class A
{
public static void main(String[] gg)
{
//Boxing process using Constructors
Integer obj1=new Integer(123);
Integer obj2=new Integer("124");
//Boxing through value of Method 
Integer obj3=Integer.valueOf(125);
Integer obj4=Integer.valueOf("anuk");
System.out.println("---After Boxing Procedure---");
System.out.println("obj1 "+obj1);
System.out.println("obj2 "+obj2);
System.out.println("obj3 "+obj3);
System.out.println(obj4+obj2);///integer of String Addition///
System.out.println(" "+obj4+obj2);
//Unboxing process using intValue() method
System.out.println("---After UnBoxing Procedure---");
String s2=obj2.toString();
String s1=obj1.toString();
String s3=obj3.toString();
String s4=obj4.toString();
long f1=obj1.longValue();
System.out.println(s1+" "+s2+" "+s3+" "+s4);
System.out.println(f1);
}	
}