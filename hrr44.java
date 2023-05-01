import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int salary=20000;
        if(id>201)
        {
            System.out.println(s1);
            System.out.println(id);
            System.out.println(salary+1000);
        }
        else if(id<201)
        {
            System.out.println("No Appraisal");
        }
    }
}
