class C
{
public static void main(String[] args)
{
String s1="13/02/2018/Friday/Feb/YEAr";
String arr[]=s1.split("/");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+" Length of each String is "+arr[i].length());
}
}	
}