import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i].matches(".[0-9]."))
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        if(n>0)
        {
        System.out.println(-count);
        System.out.println(n+count);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
