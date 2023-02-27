import java.util.Scanner;
class infer1
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
