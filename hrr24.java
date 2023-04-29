import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        
        int mul=1;
        int a=2;
        
        for (; a <= n / 2; ++a)
            
        if(i==1 && n%2==0)
        {
            System.out.println("EVEN");
        }
        
        else if(i==1 && n%2==1)
        {
            System.out.println("NO");
        }
        
        else if(i==2 && n%2==1)
        {
            System.out.println("ODD");
        }
        
        else if(i==2 && n%2==0)
        {
            System.out.println("NO");
        }
        
        else if(i==3 && n%a == 0)
        {
            System.out.println("PRIME");
        }
        
        else if(i==3 && n%a!=0)
        {
            System.out.println("NOT PRIME");
        }
        
        else if(i==4)
        {
            for(int b=1;b<=n;b++)
                mul=mul*b;
            System.out.println(mul);
        }
    }
}