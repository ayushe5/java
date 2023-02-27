
mport java.util.Scanner;
class menu
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int balance=500000;
int wd,dp,n,l,b;
System.out.print("Enter the input: ");
n=sc.nextInt();

if(n==0)
{
System.out.print("Enter the amount to be withdrawn: ");
wd=sc.nextInt();
l=balance-wd;
System.out.println("The balance left is: "+l);
System.out.println("Successfully done");
}

else if(n==1)
{
System.out.println("Enter the amount to be depositted: ");
dp=sc.nextInt();
b=balance+dp;
System.out.println("The total balance after depoisition is: " +b);
System.out.println("Successfully Deposited");
}

else if(n==2)
{
System.out.println("The current balance is: "+ balance);
}

else
{
System.out.println("Invalid input");
}}
}