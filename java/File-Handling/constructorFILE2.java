import java.io.*;
public class constructorFILE2
{
//File Pointer f1 points to the MetaData of the File//
//It does not access to the File//
public static void main(String[] args) throws IOException
{
File pfile=new File("C:/data/java1/anuj/java","/File-Handling/anuj8989.txt");///File(String parent,String child)
pfile.createNewFile();
System.out.println("Is File Exists:"+pfile.exists());
System.out.println("File Name is :"+pfile.getName());
System.out.println("File Length is :"+pfile.length());
System.out.println("File can write is :"+pfile.canWrite());
System.out.println(pfile);//return the address of the metadata through which it is pointing//
}
}