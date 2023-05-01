import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        int n=a;
        if(n>0)
        {
        String arr1[]=new String[n];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.next();
        }
        double marks[]=new double[n];
        for(int i=0;i<n;i++)
        {
            marks[i]=0;
            for(int j=0;j<5;j++)
            {
                if(arr1[i].charAt(j)==s.charAt(j))
                {
                    marks[i]=marks[i]+1;
                }
                else if(arr1[i].charAt(j)=='X' || arr1[i].charAt(j)=='x')
                {
                    marks[i]=marks[i];
                }
                else
                {
                    marks[i]=marks[i]-0.25;
                }
            }
            System.out.print(marks[i]+" ");
        }
        }
        else
        {
            System.out.println("Incorrect Input");
        }
    }
}
        
