class A
{
public static void main(String hfj[])
{
StringBuffer first=new StringBuffer("Rays");
StringBuffer second=new StringBuffer("Rays");
System.out.println(first==second); // Compare the reference of objects pointing 
System.out.println(first.equals(second)); // Not overrided so now same as ( x==y )
                                          // This method is defined in Object Class 
System.out.println(first);
}
}