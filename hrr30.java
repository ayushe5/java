import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        int n=sc.nextInt();
        
        String arr[]=s.split(" ");
        int count=0;
        
        if(n>0 && n<11)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i].length()==n)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}