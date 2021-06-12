pro//// The object cloning is a way to create exact copy of an object.
//// For this purpose, clone() method of Object class is used to clone an object.
//// The java.lang.Cloneable interface must be implemented by the class whose
//// object clone we want to create. If we don't implement Cloneable interface,
//// clone() method generates CloneNotSupportedException///
class Student18 implements Cloneable{
int rollno;
String name;
Student18(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
///The Cloneable interface is a marker interface - it has no methods////
///clone() is not the Cloneable interface the clone() method is in class Object//
//So implementing we just overrided the method in class Object by making this//
public Object clone()throws CloneNotSupportedException{
return super.clone();
}
public static void main(String[] args)
{
try{
///Use try and catch Blocks to Solve the Exceptions///
Student18 s1=new Student18(101,"amit");
Student18 s2=(Student18)s1.clone();
Student18 s3=(Student18)s2.clone();
//This Method Return Type is Boolean//
System.out.println(s2.equals(s2));
//This Method Return Type is Also Boolean//
System.out.println("______________");
System.out.println("Hash Codes of the Given Strings");
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s3.hashCode());
System.out.println("______________");
System.out.println(s3.rollno+"  "+s3.name);
System.out.println(s2.rollno+"  "+s2.name);
System.out.println(s1.getClass());
System.out.println(s1.toString());
}
catch(Exception e){}
}
}

