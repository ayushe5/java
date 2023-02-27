import java.util.Scanner;
class factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,n;
int mul=1;
n=sc.nextInt();
for(i=1;i<=n;i++)
mul=mul*i;
System.out.println(mul);
}
}
