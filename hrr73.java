import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(join(a,b));
        
    }
    static String join(String a,String b)
    {
        int z=a.length();
        int y=z/2;
        StringBuffer res=new StringBuffer(a);
        res.insert(y,b);
        return res.toString();
    }
}
