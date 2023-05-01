import java.util.Scanner;
class Student
{
    Scanner sc=new Scanner(System.in);
    String name; //String and int attributes
    int reg;
    void show(String a,int b)   //parameterized show function
    {
        while(true) //loop for checking registration number constraint
        {
            name=a;
            reg=b;
            if(b<0)
            {
            }
            else
            {
                System.out.println(name+","+reg);
                break;
            }
        }
    }
}
class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();   //first input     

        if(n==1)    //first choice
        {
            sc.nextLine();
            String s1=sc.nextLine();
            int r1=sc.nextInt();
            Student s=new Student();
            s.show(s1,r1);
        

        }
        else if(n==2)   //second choice
        {
            Student s5=new Student();
            s5.show("null",0); //for default values
        
        }
        else  //invalid case
        {
            System.out.println("Wrong Choice");
        }
        }
        
        
    }

