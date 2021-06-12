import java.io.File;
import java.net.*;
public class constructorFILE3 
{
///File Pointer only points to the metadata of the File it does not points to the Actual 
////Data of the File or Accesing the File
  public static void main(String[] args) throws Exception
  {
      File aFile = new File(new URI("file:///c:/a.bat"));
      System.out.println(aFile.getParent());//Get Parent Name of the File
	  System.out.println(aFile.getName());//Get the Name of the File
	  System.out.println(aFile.getPath());//Get Full Path of the File in Form of String
  }
}