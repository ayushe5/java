import java.util.Scanner;


class volume
{
int l;
int w;
int h=10;

void get_data()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the dimensions: ");
l=sc.nextInt();
w=sc.nextInt();
h=sc.nextInt();
}

void print_Data()
{
System.out.println();

}

};

class Mainvolume
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
volume v=new volume();
v.get_data();
}
}