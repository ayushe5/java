import java.util.Scanner;
class evenodd //to check if number is even,odd,positive,negative
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number: ");
n=sc.nextInt();

if(n%2==0 && n>0)
{
System.out.println("n is even and positive");
}
else if(n%2==0 && n<0)
{
System.out.println("n is even and negative");
}
else if(n%2!=0 && n>0)
{
System.out.println("n is odd and positive");
}
else if(n%2!=0 && n<0)
{
System.out.println("n is odd and negative");
}
}
}