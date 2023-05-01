import java.io.*;
import java.util.*;

public class Solution {
    String x;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        String a=occur(s1);
        String b=occur(s2);
        if(a.length()>2 || b.length()>2)
        {
        if(a.equals(b))
        {
            System.out.println("ANAGRAM");
        }
        else
        {
            System.out.println("NOT ANAGRAM");
        }
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
    static String occur(String r)
    {
        char t[]=new char[r.length()];
        for(int i=0;i<r.length();i++)
        {
            t[i]=r.charAt(i);
        }
        Arrays.sort(t);
        toString(t);
        return toString(t);
    }
    public static String toString(char n1[])
    {
        String string = new String(n1);
        return string;
    }
}