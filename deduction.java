import java.util.Scanner;
class Salary
{
int s;
Salary(int s)
{
this.s=s;
}
}
class deduction
{
int j;
deduction(int s)
{
this.j=j;
}
void show()
{
if(j>500000 && j<1000000)
{
j=(95*j)/100;
System.out.println(j);
}
else if(j>1000000)
{
j=(90*j)/100;
System.out.println(j);
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
Salary o=new Salary(y);
int n=sc.nextInt();
deduction o2=new deduction(n);
o2.show();
}}