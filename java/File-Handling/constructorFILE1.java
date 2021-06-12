import java.io.*;
public class constructorFILE1
{
public static void main(String[] args) throws IOException
{
File parent=new File("C:/data/java1/anuj/java");
File Child=new File(parent,"/File-Handling/anuj.txt");
Child.createNewFile();
System.out.println("Is File Exists:"+Child.exists());
System.out.println("File Name is :"+Child.getName());
System.out.println("File Length is :"+Child.length());
System.out.println("File can write is :"+Child.canWrite());
System.out.println(parent);//It returns the Pointing Address of the Parent//
//Jisko bhi wo point kr raha hai//
System.out.println(Child);//It returns the Pointing Address of the Child////
//Jisko bhi wo point kr raha hai//
}
}