import java.io.*;
import java.util.Scanner;
import java.util.*;

class Employee
{
    int id,age;
    Employee(int a,int b)
    {
        id=a;
        age=b;
    }
}
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arrs[]=new int[n];
        Employee arr[]=new Employee[n];
        if(n>=1 && n<=10)
        {
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int z=sc.nextInt();
            arr[i]=new Employee(x,z);
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i].age>18 && arr[i].age<50)
            {
            arrs[i]=arr[i].age;
            }
        }
            Arrays.sort(arrs);
            int x=arrs[0];
            for(int i=0;i<n;i++)
            {
                if(arr[i].age<30 && arr[i].age>18 && arr[i].age==x)
                {
                    System.out.print(arr[i].id+" "+arr[i].age);
                }
                else if(arr[i].id<10 || arr[i].id>1000 || arr[i].age<18 || arr[i].age>50 )
                {
                    System.out.println("Invalid data");
                }
            }

        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
