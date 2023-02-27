import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
char grade;
float salary;
int age;
String name;
System.out.println("Enter name of employee: ");
name=obj.nextLine();
System.out.println("The age of employee is: ");
age=obj.nextInt();
System.out.println("Enter grade of employee: ");
grade=obj.next().charAt(0);
System.out.println("Enter salary of employee: ");
salary=obj.nextFloat();


System.out.println("/nName: "+name);
System.out.println("Age: "+age);
System.out.println("Grade: "+grade);
System.out.println("Salary: "+salary);
}
}

