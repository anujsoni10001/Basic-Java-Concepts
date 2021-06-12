import java.util.*;
import java.io.*;
class Demo
{
public static void main(String[] args) throws Exception	
{	
String str;
int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the File Path:");	
str=sc.next();
File f1=new File(str);
if(f1.exists())
{
FileReader fr=new FileReader(f1);
do
{
x=fr.read();
System.out.print((char)x);
}while(x!=-1);
}
else
{
System.out.println("File Does not Exists");	
}
}
}