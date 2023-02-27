class reverse
{
public static void main(String[] args)
{
int number=68,reverse=0;
for(;number!=0;)
{
int remainder=number%10;
reverse=reverse*10+remainder;
number=number/10;
System.out.println("The reverse of the number is " +reverse);
}
}
}