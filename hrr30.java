import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if (x>9 && x<1001 && y>9 && y<1001)
        {
            System.out.println(cmp(x,y));
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
    static boolean cmp(int x, int y)
    {
        return x>y;
    }
}