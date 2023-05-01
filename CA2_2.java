import java.util.Scanner;
class InvalidTriangleException extends Exception
{
public InvalidTriangleException(String s)
{
super(s);
}
}
class ABCE
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if(a<20 && b<20 && c<20)
{ 
try
{
if(a+b<c || b+c<a || a+c<b);
throw new InvalidTriangleException("InvalidTriangle");
}

catch(InvalidTriangleException e)
{
System.out.println(e.getMessage());
}


if(a+b>c && b+c>a && a+c>b)
{
System.out.println("Valid Triangle");
}
}
else
{
System.out.println("Invalid Input");
}
}
}
