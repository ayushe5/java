import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.matches(".[0-9].")==true || s.matches("[a-zA-Z]+")==true)
        {
            int[] a=new int[s.length()];
            char c=s.charAt(0);
            int max;
            char s1[]=s.toCharArray();
            
            for(int i=0;i<s1.length;i++)
            {
                a[i]=1;
                for(int j=i+1;j<s1.length;j++)
                {
                    if(s1[i]==s1[j] && s1[i]!=' ' && s1[i]!='0')
                    {
                        a[i]++;
                        s1[j]='0';
                    }
                }
            }
            max=a[0];
            for(int i=0;i<a.length;i++)
            {
                if(max<a[i])
                {
                    max=a[i];
                    c=s1[i];
                }
            }
            System.out.println("Maximum occurring character is: "+c);
        }
        else
        {
            System.out.println("Error");
        }
    }
}
