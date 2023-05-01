import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        occur(s);
    }
    
    static void occur(String r)
    {
        if(r.length()>5)
        {
        char t[]=new char[r.length()];
        for(int i=0;i<r.length();i++)
        {
            t[i]=r.charAt(i);
        }
        Arrays.sort(t);
        int c[]=new int[256];
        int len=r.length();
        
        for(int i=0;i<len;i++)
        {
            c[r.charAt(i)]++;
        }
        char ch[]=new char[r.length()];
        for(int i=0;i<len;i++)
        {
                int a=0;

            ch[i]=r.charAt(i);
            for(int j=0;j<i+1;j++)
            {
                if(r.charAt(i)==ch[j])
                    a++;
            }
            if(a==1)
            {
                System.out.print(t[i]+""+c[r.charAt(i)]);
            }
        }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}