class result
{
public static void main(String[] args)
{
int x,y,r1,r2,r3,r4,r5,r6,r7;
x=9;
y=7;

r1=x+y;
r2=x-y;
r3=x*y;
r4=x/y;
System.out.println("x+y=" + r1);
System.out.println("x-y=" + r2);
System.out.println("x*y=" + r3);
System.out.println("x/y=" + r4);

r5=x%y;
System.out.println("x%y=" + r5);

r6=r5++;
System.out.println("r5 ++ =" + r6);

r7=--r6;
System.out.println("-- r6 =" + r7);
}
}