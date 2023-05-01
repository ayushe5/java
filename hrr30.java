import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int marks[]=new int[n];
        if(n>0 && n<11)
        {
            for(int i=0;i<marks.length;i++)
            {
                marks[i]=sc.nextInt();
            }
            for(int i=0;i<marks.length;i++)
            {
                if(marks[i]>=0 && marks[i]<101)
                {
                    int sum=0;
                    for(int s:marks)
                        sum=sum+s;
                    System.out.println(sum);
                    break;
                }
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}