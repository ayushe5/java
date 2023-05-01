import java.util.Scanner;
class except
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
try{
if(b==0);
}
catch(ArithmeticException e)
{
System.out.println("ArthameticException");
}

if(b!=0)
{
int c=a/b;
System.out.println(c);
}
}
}