import java.util.Scanner;
class AB
{
Scanner sc=new Scanner(System.in);
int[] Arr=new int[20];
int first=sc.nextInt();
int diff=sc.nextInt();
int i;


}
class ABCD
{
public static void main(String[] args)
{
int i;
AB ob=new AB();
for(i=0;i<20;i++)
for(int n=0;n<=i;n++)
ob.Arr[i]=ob.first+n*ob.diff;
System.out.print(ob.Arr[i]);
}
}