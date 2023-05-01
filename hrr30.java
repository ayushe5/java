import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=10 && n<=50)
        {
            for(int i=1;i<n;i++)
            {
                if(n%i==0 && Prime(i))
                {
                    System.out.print(i+" ");
                }
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    public static Boolean Prime(int i)
    {
        if(i<=1 || i==4)
        {
            return false;
        }
        for(int j=2;j*j<i;j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }
}