import java.util.Scanner;
interface abc
{
    boolean valid(String str, int n);
}


public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        
        abc a = (s, num) -> {
            if (num<1)
            {
                System.out.println("Invalid input");
                return false;
            }
            else
            {
                if (s.length() > num)
                {
                    System.out.println("Valid string");
                    return true;
                }
                else
                {
                    System.out.println("Invalid string");
                    return false;
                }
            }
        };
        a.valid(str,n);
    }
}