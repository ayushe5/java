import java.io.*;
import java.util.*;

public class Solution {



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                    Scanner sc=new Scanner(System.in);

                    int n=sc.nextInt();
                int z=sc.nextInt();


        Solution s=new Solution();
        boolean value=s.isBigger(n,z);
        String val=Boolean.toString(value);
        if(n>1 && n<1000 && z>1 && z<1000)
        {
        System.out.println(val);
        }
        }
            boolean isBigger(int a,int b)
            {
                    if(a>b)
                    {
                        return true;
                    }
                
                    else
                    {
                        return false;
                    }
            }
            
    }
