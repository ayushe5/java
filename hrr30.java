import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int per=sum/n;
        if(per>90)
        {
            System.out.println("A+");
        }
        else if(per>=70 && per<=89)
        {
            System.out.println("A");
        }
        else if(per>=60 && per<=69)
        {
            System.out.println("B");
        }
        else if(per>=50 && per<=59)
        {
            System.out.println("C");
        }
        else if(per<=40)
        {
            System.out.println("D");
        }
    }
}