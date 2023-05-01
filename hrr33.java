import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sec;
        if(n>=0)
        {
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]>a[j])
                    {
                        sec=a[i];
                        a[i]=a[j];
                        a[j]=sec;
                    }
                }
            }
            if(a[0]<0)
            {
                System.out.println("Invalid Array Elements");
            }
            else
            {
                System.out.println(a[n-2]);
            }

        }
        else
        {
            System.out.println("Invalid Array Size");
        }
    }
}
