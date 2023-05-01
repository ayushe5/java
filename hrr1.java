import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1>0 && n2>0)
        {
            System.out.println(+ n1+"-"+n2);
    }
        else
            System.out.println("Invalid Input");
    }
}
