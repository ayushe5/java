import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s;
        double arr[][]=new double[n][];
        for(int i=0;i<arr.length;i++)
        {
            s=sc.nextInt();
            arr[i]=new double[s];
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextDouble();
            }
        }
        int l=sc.nextInt();
        double sum=0.0;
        double avg=0.0;
        for(int i=0;i<arr.length;i++)
        {
            if(i==l)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    sum=sum + arr[i][j];
                }avg= sum/(arr[i].length+2);
        System.out.println("Average in Subject-"+l+" is "+avg);
    }            
        }
    }
}