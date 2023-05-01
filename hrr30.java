import java.util.Scanner;


public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        if(strings.length>1)
        {
        for (int i = 0; i < n; i++) 
        {
            strings[i] = sc.next();
        }
        for (String str : strings) 
        {
            if (str.endsWith("g")||str.endsWith("G")) 
            {
                String newStr = str.substring(0, str.length());
                newStr.chars().forEach(c -> System.out.print((char) c));
                System.out.println();
            }
        }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}