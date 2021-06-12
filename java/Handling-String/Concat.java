class Concat
{
public static void main(String[] args)	
{
String s1="0";
String s2="1";
String s3=s1+s2;
String s4=s1.concat("1").concat(s2)+s1;
System.out.println(s3.concat(s4));
}
}