import java.util.*;
import java.lang.*;
class K
{
protected String no;
protected String name;
protected double balance;
void Set(String no,String name,double balance)
{
this.no=no;
this.name=name;
this.balance=balance;
}
void display()
{
Date d1=new Date();
System.out.println("______________________________________________________________");
System.out.println("The name of the Customer in the Bank is " +name);
System.out.println("Balance in the Bank Account No. is "+balance);
System.out.println("The Date of the Transaction is"+d1);
System.out.println("______________________________________________________________");
}
void deposit(double amount)
{
balance=balance+amount;
display();
}
void withdraw(double amount)
{
if(amount<=this.balance)
{
balance=balance-amount;
display();
}
else
{
System.out.println("Maximum limit per day exceed as per as RBI Guidelines");
}
}
}
class SBI extends K
{
int counter=0;
void withdraw(double amount)
{
if(amount<=this.balance)
{
balance=balance-amount;
}
else
{
System.out.println("Maximum limit per day exceed as per as RBI Guidelines");
counter++;
if(counter>=4)
{
System.out.println("Ab dek tu maa ke labre");
}
}
}
}
class Demo
{
public static void main(String[] args)
{
while(true)
{
SBI s1=new SBI();
Scanner sc=new Scanner(System.in);
System.out.println("Press 1 to Exit");
System.out.println("Press 2 to deposit");
System.out.println("Press 3 to withdraw");
System.out.println("Press 5 to Set methods");
int num = sc.nextInt();
switch(num)
{
case 1:System.exit(0);
break;
case 2:System.out.println("Enter the amount to deposit");
       Scanner sc1=new Scanner(System.in);
       double amount= sc1.nextDouble();
       s1.deposit(amount);
break;
case 3:System.out.println("Enter the amount to Withdraw");
       Scanner sc2=new Scanner(System.in);
       double amount1= sc2.nextDouble();
       s1.withdraw(amount1);
break;
case 5:s1.Set("20189412238","Anuj",3000);
break;
}
}
}
}
