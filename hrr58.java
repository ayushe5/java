import java.util.Scanner;
class Student
{
    String name;
    int reg;
    void show(String s,int r)
    {
        name=s;
        reg=r;
        System.out.println(name+","+reg);
    }
}
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n==1)
        {
            Student s4=new Student();
            sc.nextLine();
            String s3=sc.nextLine();

            int r1=sc.nextInt();
            if(r1>0)
            {
            s4.show(s3,r1);
            }
            while(r1<0)
            {
                n=sc.nextInt();
            }
        }
        else if(n==2)
        {
            System.out.println("null,0");
        }
        if(n>2)
        {
            System.out.println("Wrong Choice");
        }
    }
}
