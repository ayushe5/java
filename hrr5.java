import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,i=2;
        n=sc.nextInt();
        for(;i<n;i++)
        {
            int s=i*i*i;
            if(s==n)
            {
                System.out.println("Perfect Cube");
                break;
            }
            else if(s>n)
            {
            System.out.println("Not Perfect Cube");   
                break;
        }
        }
    }
}
