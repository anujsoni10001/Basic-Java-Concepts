import java.io.*;
class wpl
{
public static void main(String[] args)
{
System.out.println("<---wp1.java--->");
byte b1=10;
Byte b2=new Byte(b1);
System.out.println("1)"+b2);
String st1=b2.toString();
System.out.println("2 )"+st1);
String st2=new String("100");
Byte b3=new Byte(st2);
System.out.println("3 ) "+b3);
}	
}