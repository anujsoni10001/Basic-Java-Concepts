class F
{
public static void main(String[] args)
{
String s1=new String("Hello Vipin");
String arr[]=s1.split(" ");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
String s2="Anuj Soni";
System.out.println(s2);
System.out.println(s2.length());
String s3="Anuj Soni Esha Soni";
String a[]=s3.split(s2);
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+"  "+a[i].length());
}
System.out.println(s3.length());
}
}