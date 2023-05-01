import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n+1];
        if(n>1)
        {
        for(int i=0;i<n+1;i++)
        {
            s[i]=sc.nextLine();
        }

            Arrays.sort(s);
        for(int i=1;i<n+1;i++)
        {
                   System.out.println(s[i]);
        }
        }
        else if(n<2)
        {
            System.out.println("Invalid");
        }
    }
}
