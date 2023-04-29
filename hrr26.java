import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int a=11*p/10;
        double emi= a/12;
        double emi1=emi+0.33d;
        
        System.out.println(a);
        System.out.println(emi1);
    }
}