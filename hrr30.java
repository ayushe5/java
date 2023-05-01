import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0 && n<=5)
        {
            int[] Arr=new int[7];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<7;j++)
                {
                    Arr[j]=sc.nextInt();
                }
            for(int j=0;j<n;j++)
            {
                for(int l=0;l<7;l++)
            {
                int sum=0;
                for(int s:Arr)
                    sum=sum+s;
                
            
                if(sum==56)
                {
                    System.out.println("1");
                    break;
                }
                else
                {
                    System.out.println("0");
                    break;
                }
                    
            }
                break;
            } 
        
    
}}}}