import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String sr=sc.nextLine();
        int c=Integer.parseInt(sr,2);
        
        if(sr.length()!=8 && c>=65 && c<=90)
        {
            System.out.println((char)c);
        }
        
        else
        {
            System.out.println("INVALID PAPER CODE");
        }
    }
}