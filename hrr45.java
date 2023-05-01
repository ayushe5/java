import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        s.factorial();
    }
    void factorial()
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int mul=1;
        n=sc.nextInt();
        if(n>=1 && n<=10)
        {
        for(i=1;i<=n;i++)
        mul=mul*i;
        System.out.println(mul);
        }
    }
}
