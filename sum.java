import java.util.Scanner;
class sum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
for(int i=1;i<n;i++)
if(i%10==0)
continue;
{
int z= n/i;
sum=sum + z;
System.out.println(z);
}
}
}
//*28,50
12,10
14,8
16,6*