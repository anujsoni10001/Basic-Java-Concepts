class A
{
public static void main(String[] args)
{
String s1=new String("126546");
String s2="2761";
String s3="1287483";
String s4=new String("true");
Integer i1=new Integer(s1);//Boxing
Integer i2=new Integer(s2);//Boxing
Integer i3=new Integer(s2);//Boxing 
Boolean b1=new Boolean(false);
System.out.println(i1.intValue()+" "+i2.toString()+" "+s3+" "+b1.booleanValue());///AutoBoxing Process
}	
}