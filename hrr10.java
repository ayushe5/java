import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        double s=n;
        
        if(n>=0)
        {
            System.out.println(s);
        }
        
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
