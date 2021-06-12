import java.io.*;
import java.util.*;
class A
{
public static void main(String[] args)throws Exception
{
String ps,pd;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Source File Path....");
ps=sc.nextLine();
System.out.println("Enter the Destination File Path.....");
pd=sc.nextLine();
File fs=new File(ps);
File fd=new File(pd);
FileInputStream fis=new FileInputStream(fs);
FileOutputStream fout=new FileOutputStream(fd);
BufferedInputStream bis=new BufferedInputStream(fis);
BufferedOutputStream bos=new BufferedOutputStream(fout);
if(fs.exists() && fd.exists())
{
int x;
while((x=bis.read())!=-1)
{
bos.write(x);
}
bos.close();
fout.close();
bis.close();
fout.close();
}
else
{
if(fs.exists())
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
