//Using Byte Stream//
import java.io.*;
public class FileWriteOperation
{
public static void main(String[] args) throws Exception
{
int i;
FileOutputStream fout=new FileOutputStream("name.txt",true);
File f=new File("name.txt");
String s="Hardik is a Good Boy............ Hardik Love Playing Games....Hardik Mother Name is Deepali Soni But Father Name is Deepak Soni";
char ch[]=s.toCharArray();
for(i=0;i<s.length();i++)
{
fout.write(ch[i]);
}
fout.close();
System.out.println(f.length());//Its Length continously increases//
}
}