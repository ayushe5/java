import java.util.Scanner;
class Solution
{
    public boolean check(int n)
    {
        if(n%2==0 && n%13==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        Solution s=new Solution();
        if(n1>10 && n1<500 && s.check(n1)==true)
        {
            System.out.println("True");
        }
        else if(n1>10 && n1<500 && s.check(n1)==false)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}