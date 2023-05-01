import java.util.Scanner;
class Solution
{
    public static boolean check(int n)
    {
        if(n%2!=0 && n%3!=0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>20 && n<400 && check(n))
        {
            System.out.println("True");
        }
        else if(n>20 && n<400 && check(n)==false)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}