import java.io.*;
import java.util.Scanner;

class Solution
{
    public static boolean pal(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
                j--;
        }
        return true;
    }
    public static boolean palr(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
        if(s.charAt(i)!=s.charAt(j))
        {
            if(pal(s.substring(i+1,j+1)) || pal(s.substring(i,j)))
                return true;
            else
                return false;
        }
        i++;
        j--;
        }
    return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(palr(s));
    }
}
