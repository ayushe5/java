import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int tot=sc.nextInt();
        int att=sc.nextInt();
        int par=(att*100)/tot;
        
        if(tot>att && tot>0 && att>=0 && par>=75)
        {
            System.out.println(+ par);
            System.out.println("Yes");
        }
       
        else if(tot>att && tot>0 && att>=0 && par<75)
        {
            System.out.println(+ par);
            System.out.println("No");   
        }
        
    }
}
