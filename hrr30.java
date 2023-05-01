import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        int n=sc.nextInt();
        
        int count=0;
        int li=0;
        while(li!=-1)
        {
            li=s1.indexOf(s2,li);
            if(li!=-1)
            {
                count++;
                li=li+s2.length();
            }
        }
        if(n>0)
        {
        if(count<n && s1.indexOf(s2)!=-1)
        {
            System.out.println(s1.lastIndexOf(s2));
        }
        else if(count>=n && s1.indexOf(s2)!=-1)
        {
            System.out.println(s1.indexOf(s2,n));
        }
        else
        {
            System.out.println("Not Present");
        }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}