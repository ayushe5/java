import java.util.Scanner;
class Student
{
    String a;
    Student(String b)
    {
        a=b;
    }
}
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        String a1=sc.nextLine();
        String b1=sc.nextLine();
        
        Student s1=new Student(a1);
        Student s2=new Student(b1);
        
        boolean c1=a1.matches("[a-zA-Z]+");
        boolean c2=b1.matches("[a-zA-Z]+");
        
        if(c1==true)
        {
            System.out.println(a1);
        }
        else
        {
            System.out.println("Unknown");
        }
        if(c2==true)
        {
            System.out.println(b1);
        }
        else
        {
            System.out.println("Unknown");
        }
    }
}
    
