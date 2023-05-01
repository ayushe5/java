import java.io.*;
import java.util.Scanner;

class departments
{
String depname;
String HODn;

departments()
{
Scanner sc=new Scanner(System.in);

depname=sc.nextLine();
HODn=sc.nextLine();
}
void print()
{
System.out.println(depname);
System.out.println(HODn);
}
}
class staffmember extends departments
{
String staffname;
String qual;

staffmember()
{
Scanner sc=new Scanner(System.in);
depname=sc.nextLine();
HODn=sc.nextLine();
staffname=sc.nextLine();
qual=sc.nextLine();
}
void print()
{
System.out.println(depname);
System.out.println(HODn);
System.out.println(staffname);
System.out.println(qual);
}
}

class department
{
public static void main(String[] args)
{
departments d=new departments();
staffmember s=new staffmember();
d.print();
s.print();
}
}
