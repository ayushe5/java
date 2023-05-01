import java.util.Scanner;
class Solution
{
    public void sorting(int arr[])
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    c=arr[i];
                    arr[i]=arr[j];
                    arr[j]=c;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[10];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        Solution s=new Solution();
        s.sorting(arr1);
    }
}
