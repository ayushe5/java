import java.util.*;
import java.util.Scanner;
class Solution
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char c=sc.next().charAt(0);
int count=0;
char b;
for(int i=0;i<s.length();i++)
{
b=s.charAt(i);
if(c==b)
{
count++;
}
}

System.out.println(count);
}
}
