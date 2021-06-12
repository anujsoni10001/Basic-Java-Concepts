class Concat
{
public static void main(String[] args)	
{
String s1="ANuj ";
String s2="Vipin ";
String s3=s1+s2;
String s4=s1.concat(s1.concat(s2.concat(s1))).concat("Helekdekfn")+s1;
System.out.println(s3.concat(s4));
}
}