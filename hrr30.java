import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double radius;
        double arr[]=new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();
            double Area=arr[i]*arr[i]*3.14;
            if(Area>30.0 && n>1 && n<10 && arr[i]>0.1 && arr[i]<50)
            {
                double b=Math.round(Area*10000)/10000.0;
                System.out.println(b);
            }
                                   else if(n<1)
                                   {
                                       System.out.println("Invalid Input");
                                   }
        }
    }
}