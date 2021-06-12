import java.util.*;
class Employee
{
String id;
String name;
double salary;
String Company;
String Mobile;
Employee(String id,String name,double salary,String Company,String Mobile)
{	
this.id=id;
this.name=name;
this.salary=salary;
this.Company=Company;
this.Mobile=Mobile;
}
void ShowId()
{
System.out.println(this.id);
}
void ShowName()
{
System.out.println(this.name);
}
void ShowSalary()
{
System.out.println(this.salary);
}
void ShowCompany()
{
System.out.println(this.Company);	
}
void ShowMobile()
{
System.out.println(this.Mobile);	
}
public static void main(String[] args)
{
Employee e1=new Employee("132132123","Anuj",23000,"TCS","8962422004");
Employee e2=new Employee("132132123","Aman",23000,"TCS","8962422004");
Employee e3=new Employee("132132123","Vipin",23000,"TCS","8962422004");
Employee e4=new Employee("132132123","Archit",23000,"TCS","8962422004");
Employee e5=new Employee("132132123","Dharmendra",23000,"TCS","8962422004");
Employee e6=new Employee("132132123","Ankit",23000,"TCS","8962422004");
Employee e7=new Employee("132132123","Chetan",23000,"TCS","8962422004");
Employee e8=new Employee("132132123","Deepak",23000,"TCS","8962422004");
Employee e9=new Employee("132132123","Shubham",23000,"TCS","8962422004");
Employee e10=new Employee("132132123","Rajat",23000,"TCS","8962422004");
///Creation of the Collection Class//
LinkedHashSet<Employee> a1=new LinkedHashSet<Employee>();
//Adding the objects to the Collection Class //
a1.add(e1);
a1.add(e2);
a1.add(e3);
a1.add(e3);
a1.add(e4);
a1.add(e5);
a1.add(e6);
a1.add(e7);
a1.add(e8);
a1.add(e9);
a1.add(e10);
//Using ForEach Loop to return the references of the object inserted in the Collection
//inserted in the Collection objects//
for(Object o:a1)
{
Employee e=(Employee)o;
e.ShowName();
}
System.out.println(a1.size());
a1.remove(e8);
System.out.println(a1.size());
System.out.println(a1.contains(e8));
}
}