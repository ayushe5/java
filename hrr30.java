import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(n<8)
            {
            arr[i]=sc.nextInt();
            sum=sum + arr[i];
            }
        }
        int p=(sum)/n;
        if(p>90 && n<8)
        {
            System.out.println("A+");
        }
        else if(p>=70 && p<90 && n<8)
        {
            System.out.println("A");
        }
        else if(p>=60 && p<=69 && n<8)
        {
            System.out.println("B");
        }
        else if(p>=50 && p<=59 && n<8)
        {
            System.out.println("C");
        }
        else if(p<=40 && n<8)
        {
            System.out.println("D");
        }

        
    }
}