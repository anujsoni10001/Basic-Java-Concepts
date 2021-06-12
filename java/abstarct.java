abstract class A
{
abstract void Loanrepay();
}
class B extends A
{
void Loanrepay()
{

}
}
abstract class C extends B
{
void Loan()
{


}
}
class D extends C
{
public static void main(String[] k)
{
D d1=new D();
d1.Loanrepay();
}
}
