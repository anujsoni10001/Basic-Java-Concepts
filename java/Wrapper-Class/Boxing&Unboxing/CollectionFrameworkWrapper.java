///Concept of Unboxing and Boxing in Java //
import java.util.*;
class U
{
public static void main(String[] args)
{
ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(3);//AutoBoxing
a1.add(4);//AutoBoxing
a1.add(5);//AutoBoxing
for(Integer i1:a1)
{
int i=i1;//AutoUnBoxing//
System.out.print(i);
}	
for(Integer i1:a1)
{
System.out.print(i1);
}	
for(Object e:a1)
{
System.out.print(e);
}
for(Object e:a1)
{
int a=(int)e;////AutoUnBoxing & TypeCasting//
System.out.print(a);
}
}
}