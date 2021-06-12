//Using Byte Stream//
import java.io.*;
class FileReadAndWriteOperation
{
public static void main(String[] args) throws Exception
{
int i;
//Creation of the File//
File f=new File("name.txt");
FileOutputStream fout=new FileOutputStream("name.txt",true);
//Performing the Write Operation into the File//
String s="Asha Soni is A Bad Boy and Sweet Kind Hearted";
char c[]=s.toCharArray();
for(i=0;i<s.length();i++)
{
fout.write(c[i]);
}
fout.close();
//Writing is Completed//
//Performing the Read Operation into the File//
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