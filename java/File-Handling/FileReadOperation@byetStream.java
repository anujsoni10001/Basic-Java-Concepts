//Using Byte Stream//
import java.io.*;
public class FileReadOperation
{
public static void main(String[] arsg) throws Exception
{
int i;
File f=new File("name.txt");
f.createNewFile();
FileInputStream fin=new FileInputStream("name.txt");
do
{
i=fin.read();
if(i!=-1)
System.out.print((char)i);
}while(i!=-1);
fin.close();
}	
}