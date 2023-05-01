import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Complex a1=new Complex();
        int i3=sc.nextInt();
        int n3=sc.nextInt();
        int s3=sc.nextInt();
        int r=sc.nextInt();
        Complex a6=new Complex(i3,n3);
        Complex a7=new Complex(s3,r);
        a1.Mul_Complex(a6,a7);
    }
}
class Complex
{
        Scanner sc=new Scanner(System.in);
        int real,imaginary;
    Complex()
    {
        real=0;
        imaginary=0;

    }
    Complex(int a,int b)
    {
        real=a;
        imaginary=b;
    }

        void Mul_Complex(Complex a2,Complex b2)
        {
            int a3=a2.real;
            int b3=a2.imaginary;
            int a4=b2.real;
            int b4=b2.imaginary;
   
            Complex m=new Complex();
            m.real=(a3*a4)-(b3*b4);
            m.imaginary=(a3*b4)+(b3*a4);
            System.out.println(m.real+"+"+m.imaginary+"i");
            
        }
    void display()
    {
        int a=this.real;
        int b=this.imaginary;
            Complex a9=new Complex(a,b);
    }

}
