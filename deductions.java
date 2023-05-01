import java.util.Scanner;
class deduction
{

Scanner sc=new Scanner(System.in);
 double sal=sc.nextDouble();
double d;
void sal()
{
if(sal>5 && sal<10)
{
d=sal*5/100;
System.out.println(d);
}
else if(sal>10)
{
d=sal*10/100;
System.out.println(d);
}
}
}
class deductions
{
public static void main(String[] args)
{
deduction o=new deduction();

o.sal();
}
}