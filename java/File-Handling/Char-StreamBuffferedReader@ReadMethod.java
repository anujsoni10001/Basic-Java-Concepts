import java.io.*;
public class XXXX{

     public static void main(String []args) throws Exception{
    int i;
    FileReader f1=new FileReader("name.txt");
    BufferedReader bw=new BufferedReader(f1);
	char c[]=new char[109];
    bw.read(c,0,109);
	System.out.println(c);
    bw.close();
     }
}