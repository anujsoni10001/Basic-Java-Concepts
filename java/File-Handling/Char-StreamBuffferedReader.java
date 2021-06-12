import java.io.*;
public class XXXX{

     public static void main(String []args) throws IOException{
    int i;
    FileReader f1=new FileReader("name.txt");
    BufferedReader bw=new BufferedReader(f1);
	do
	{
    i=bw.read();		
	System.out.print((char)i);
	}while(i!=-1);
    bw.close();
     }
}