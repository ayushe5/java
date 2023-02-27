import java.util.Scanner;
class fb
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0;
int sum;
for(int i=2;i<=n;i++)
s= i-2;
sum= s + (i-1);
System.out.println("0 1 "+sum);
}
}