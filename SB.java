import java.io.*;
class SB
{
public static void main(String[] args)
{
StringBuilder s=new StringBuilder("java programming");
s.append("abc");
System.out.println(s);
s.insert(7,"abc");
System.out.println(s);
s.replace(1,5,".");
System.out.println(s);
s.delete(1,5);
System.out.println(s);
s.reverse();
System.out.println(s);

System.out.println(s.capacity());
System.out.println(s.length());

s.append("kjasjasaskljkmczs");

System.out.println(s.capacity());
System.out.println(s.length());

s.append("1");

System.out.println(s.capacity());
System.out.println(s.length());
}
}