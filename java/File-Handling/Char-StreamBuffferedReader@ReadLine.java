import java.io.*;
public class XXXX{

     public static void main(String []args) throws IOException{
   String i;
    FileReader f1=new FileReader("name.txt");
    BufferedReader bw=new BufferedReader(f1);
	do
	{
    i=bw.readLine();		
	System.out.println(i);
	}while(i!=null);
	bw.close();
	}
}