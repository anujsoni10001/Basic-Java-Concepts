//File Read And Write Operation @ Char Stream//
import java.util.*;
import java.io.*;
class A
{
public static void main(String[] args) throws Exception
{
String pr,pw;
int x;
System.out.println("Enter the Source File Path");
Scanner sc=new Scanner(System.in);
pr=sc.next();
System.out.println("Enter the Destination File Path");
pw=sc.next();
File r=new File(pr);
File w=new File(pw);
if((r.exists()) && (w.exists()))
{
//Doing By Char Scheme
FileReader fr=new FileReader(r);
FileWriter fw=new FileWriter(w,true);
while((x=fr.read())!=-1)
{
fw.write((char)x);
}
fr.close();
fw.close();
}
else
{
if(r.exists())
{
System.out.println("Destination File Does Not Exists");
}
else
{
System.out.println("Source File Does Not Exists");
}	
}
}
}