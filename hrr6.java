import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
Scanner sc= new Scanner(System.in);
                                    
int bal=20000,withd,s;
int ac=sc.nextInt();
String name=sc.nextLine();
char gen=sc.next().charAt(0);

withd=sc.nextInt();
s=bal - withd;



if(gen=='M' && withd<=20000)
{
    System.out.println("Hi Mr. "+ name);
    System.out.println("Your Account Balance after withdrawl is "+ s);
}
else if(gen=='M' && withd>20000)
{
    System.out.println("Hi Mr. "+ name);
    System.out.println("Insufficient Funds! You can not withdraw "+ withd);
}
else if(gen=='F' && withd<=20000)
{
    System.out.println("Hi Ms. "+ name);
    System.out.println("Your Account Balance after withdrawl is "+ s);
}
else if(gen=='F' && withd>20000)
{
    System.out.println("Hi Ms. "+ name);
    System.out.println("Insufficient Funds! You can not withdraw "+ withd);
}
    }
}
