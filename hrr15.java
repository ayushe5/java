import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>0 && b>0 && c>0)
        {
            int d= 9*a/10;
            int e= 4*b/5;
            int f= 7*c/10;
            System.out.println(+ d+2*e+3*f);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
