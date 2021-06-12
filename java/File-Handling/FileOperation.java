import java.io.*;
public class FileOperation
{
public static void main(String[] args) throws Exception
{
File pfile=new File("anuj.txt");
//It only access the metadata of the File//
//It does not create the File//
pfile.createNewFile();
///List of Basic File Operations//
//MetaData informations of the File Class//
System.out.println("///List of Basic File Operations//");
System.out.println("Is File Exists:"+pfile.exists());
System.out.println("File Name is :"+pfile.getName());
System.out.println("File Length is :"+pfile.length());
System.out.println("File can writed or Not:"+pfile.canWrite());
System.out.println("File Path is :"+pfile.getPath());
System.out.println("Parent Path is :"+pfile.getParent());
System.out.println("is Directory:"+pfile.isDirectory());
System.out.println("File can be Readed or Not:"+pfile.canRead());
System.out.println("Tests whether this abstract pathname is absolute:"+pfile.isAbsolute());
System.out.println("Returns the absolute pathname string of this abstract pathname:"+pfile.getAbsolutePath());
System.out.println("Before Deletion");//Before Deletion
pfile.delete();
System.out.println("After Deletion");//After Deletion
System.out.println("Is File Exists:"+pfile.exists());
}	
}