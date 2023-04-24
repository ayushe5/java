import java.util.Scanner;
class Solution
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two digit number: ");
int n=sc.nextInt();
if((n/100)<1)
{
int a=n/10;
int b=n%10;
if(((a+b)+(a*b))==n)
{
System.out.println("Special two digit number");
}
else
{
System.out.println("Not Special two digit number");
}
}
else
{
System.out.println("Invalid input");
}
}
}