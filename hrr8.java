import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int f,s;
        f=sc.nextInt();
        s=sc.nextInt();
        if(f>=0 && f<=100 && s>=0 && s<=100)
        {
            System.out.println(+ f*4+s*6);
        }
        else if(f<0 || s<0)
        {
            System.out.println(0);
        }
    }
}
