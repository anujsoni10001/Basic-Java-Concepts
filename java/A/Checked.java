//For both checked and Unchecked Exceptions comes only on Run Time//
//This is Example For Compile Time Checked Exceptions//
//We have two options for it Right Now//
//1)Handle//
//2)Throws//
class Checked
{
void m1()throws ClassNotFoundException
{
Class.forName("");	
}
public static void main(String[] args)throws ClassNotFoundException
{
Checked c1=new Checked();
c1.m1();
}	
}