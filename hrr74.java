import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        int count=0;
        int a=0;
        if(n>0)
        {
            for(int i=0;i<n;i++)
            {
                s[i]=sc.next();
            }
            for(int i=0;i<n;i++)
            {
                if(s[i].matches("[a-zA-Z]+")==true)
                {
                    count++;
                }            
            }
            System.out.println(n-count);
            System.out.println(count);
        }
    }
}
