import java.io.*;
public class constructorFILE
{
//File Pointer f1 points to the MetaData of the File//
//It does not access to the File//
public static void main(String[] args) throws IOException
{
File f1=new File("C:/data/java1/anuj/java/File-Handling/name122s.txt");
f1.createNewFile();
System.out.println("Is File Exists:"+f1.exists());
System.out.println("File Name is :"+f1.getName());
System.out.println("File Length is :"+f1.length());
System.out.println("File can write is :"+f1.canWrite());
System.out.println(f1);//It returns the Pointing Address//
//Jisko bhi wo point kr raha hai//
}
}