import java.io.*;
import java.util.Scanner;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.matches(".*[0-9].*")==false && s.length()>0)
        {
        String s1=s.toLowerCase();
        String arr[]=s1.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr[i].length()-1;j>-1;j--)
            {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}