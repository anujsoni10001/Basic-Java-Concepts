class E
{
public static void main(String[] gg)
{
String s1="hello";
//String -- return type which returns the address of  the Reference Variable of type String //
// toUpperCase()//	
//JVM Checks for  any previous object of all the characters same// 
System.out.println(s1.toUpperCase());
s1=s1.toUpperCase();
System.out.println(s1);
System.out.println(s1.toUpperCase()+s1);
String s2=" Anuj ";
String s3=" Soni ";
s3=s3.toLowerCase();
System.out.println(s2.toUpperCase()+" "+s3);
//Trimming in String//
//sX.trim() is returning the Reference of the Emutable Object//
System.out.println(s2.trim().toUpperCase()+" "+s3.trim().toLowerCase());
s2=s2.trim().toUpperCase().toLowerCase()+"  jnjdbdy  "+s3.trim().toLowerCase().toUpperCase();
System.out.println(s2);
System.out.println(s2.length());
System.out.println(s3.length());
System.out.println(s3.trim().length());
System.out.println(s3.trim().charAt(0));
}
}