import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();


    int count = 0;

    if (n <= 1) {
      System.out.println("Not prime number");
      return;
    }

    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        count++;
      }
    }

    if (count > 1) 
    {
        System.out.println("Not Prime Number");
    }
    else 
                           {
      System.out.println("Prime Number");
    }
  }
}
