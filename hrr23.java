import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] c=new int[]{2000,500,200,100};
        int[] notec=new int[4];
        
        for(int i=0;i<4;i++)
        {
            if(n>=c[i])
            {
                notec[i]=n/c[i];
                n=n%c[i];
            }
        }
        for (int i = 3; i >=0; i--)
        {
            
            if (notec[i] != 0 && n%100==0)
            {
                System.out.println(+ notec[i]+" "+c[i]+" Notes");
            }

            
        }
        if(n%100!=0)
        {
            System.out.println("Invalid Input");
        }
    }
}
