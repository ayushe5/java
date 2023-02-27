import java.util.Scanner;
class calculator
{
   public static void main(String[] args)
{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number :");
      int a = sc.nextInt();

      System.out.println("Enter second number :");
      int b = sc.nextInt();

      System.out.println("Select operation");
      String s=sc.nextLine();

      switch(s)
{
         case "add" :
         System.out.println("Sum of the given two numbers: "+(a+b));
         break;
         case "sub" :
         System.out.println("Difference between the two numbers: "+(a-b));
         break;
         case "mul" :
         System.out.println("Product of the two numbers: "+(a*b));
         case "div" :
         System.out.println("Result of the division: "+(a/b));
         break;
         default :
         System.out.println("Invalid operation");
      }
   }
}