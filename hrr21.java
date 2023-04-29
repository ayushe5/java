import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        if(n>0)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<i+1;j++)
                {
                    System.out.print("&");
                }
                System.out.println();
            }
        
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}