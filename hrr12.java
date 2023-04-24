import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Double n=sc.nextDouble();
        if(n>0 && n<6)
        {
            System.out.println("Thanks");
        }
        else if(n<1 || n>5)
        {
            System.out.println("Error: 101");
        }
    }
}
