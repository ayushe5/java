import java.io.*;
import java.util.*;

public class Sorter
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine(); 
        String[] sortedStrings = {s1, s2, s3};
        
        Arrays.sort(sortedStrings);
        for (String s : sortedStrings)
        {
            System.out.println(s);
        }
    }
}