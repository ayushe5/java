import java.util.Scanner;
class infer1 //this program gives the last name of a person
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int a=s.indexOf(' ');
int b=a+1;
System.out.println(s.substring(b));
}
}
