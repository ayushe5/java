import java.util.Scanner;
class arrays//taking values for an array using for loop
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
int arr[]=new int[n];

for(i=0;i<n;i++)
int a=arr[i];
a=sc.nextInt();
System.out.println(arr[i]);
}
}