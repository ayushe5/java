import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
       
        double temp=sc.nextDouble();
        
        double F= (temp-32)/1.8;
        
        double C= 1.8*temp + 32;
        
        if(n==1)
        {
            System.out.println((int)(F*100)/100.0);
        }
        
        else if(n==2)
        {
            System.out.println((int)(C*100)/100.0);
        }
    }
}
