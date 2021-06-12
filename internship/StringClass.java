class V
{
public static void main(String args[])
{
String first="Rays";
String second="ays";
System.out.println(first==second); /// Memory References are same or Not
System.out.println(first.equals(second));//Overided method (Object class-->> x==y)
System.out.println(first); //immutable objects cannot be modified 
first=first.toLowerCase(); //immutable objects cannot be modified 
                     //everytime new instance is created 
                    //  & hence it is slow 
System.out.println(first); //immutable objects cannot be modified 
}
}