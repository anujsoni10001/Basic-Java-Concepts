import java.io.*;
import java.util.*;
class Demo
{
public static void main(String[] args) throws Exception
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the File Path:");
str=sc.next();
File fm=new File(str);
if(fm.exists())
{
FileWriter fw=new FileWriter(fm);
fw.write("Hello This is anuj How are u I am Fine");
fw.close();
}
else
{
System.out.println("File Does Not Exists");	
}
}
}