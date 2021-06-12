import java.util.*;
class A
{
public static void main(String[] gg)
{
int i=0;
Scanner sc=new Scanner(System.in);
String name=sc.next();
while(i!=name.length())
{
System.out.print(name.charAt(i));
i++;
}	
}
}