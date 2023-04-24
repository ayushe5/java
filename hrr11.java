import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N,X;
        N=sc.nextInt();
        X=sc.nextInt();
        if(N>=0 && N<=100 && X>=0 && X<=100)
        System.out.println(+ N+X);
    }
}
