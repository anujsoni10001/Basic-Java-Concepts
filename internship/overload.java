//Overloading 
// Name Same
// Argument Different 
// Overloading return type is not considered....
class A
{
public static void main(String hh[])
{
System.out.println("Hi.. Geek From Main");
A.main("Geek");
}
public static int main(String hh)
{
System.out.println("Hi"+hh);
A.main("Dear Geek","My Geek");
return 5;
}
public static int main(String hh,String ll)
{
System.out.println("Hi"+hh+ll);
return 9+65;
}
}