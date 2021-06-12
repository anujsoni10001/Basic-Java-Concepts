class A
{
public static void main(String[] args)
{
String s1=" Asha  ";
String s2="aSHa";
System.out.println(s1.trim().compareTo(s2));
System.out.println(s1.trim().compareToIgnoreCase(s2));
}	
}