import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        
        if(n>0)
        {
            int n1=(int)n;
                System.out.println(+ n1);
        }
        
        else
        {
            System.out.println("Invalid Input");
        }
    }
}