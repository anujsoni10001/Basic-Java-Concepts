import java.io.*;
public class X{

     public static void main(String []args) throws IOException{
    FileWriter f1=new FileWriter("name.txt",true);
    BufferedWriter bw=new BufferedWriter(f1);
    bw.write("Compinsjchjhsjc");
    bw.close();
     }
}