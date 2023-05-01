import java.util.Scanner;
class Box
{
double w,h,d;
Box()
{
w=-1;
h=-1;
d=-1;
}
Box(double a,double b,double c)
{
w=a;
h=b;
d=c;
}
Box(double len)
{
w=len;
h=len;
d=len;
}
Box(Box ob)
{
w=ob.w;
h=ob.h;
d=ob.d;
}
double volume()
{
return w*h*d;
}
}

class boxweight extends Box
{
double weight;
boxweight(double a,double b,double c,double e)
{
w=a;
h=b;
d=c;
weight=e;
}
}


class boxcolor extends Box
{
String col;
boxcolor(double a,double b,double c,String e)
{
w=a;
h=b;
d=c;
col=e;
}
}



class Mainss
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
//double s1=sc.nextDouble();
//double s2=sc.nextDouble();
//double s3=sc.nextDouble();
//double s4=sc.nextDouble();


//boxweight o1=new boxweight(s1,s2,s3,s4);
//boxweight o2=new boxweight(10,10,10,15);


boxcolor o3=new boxcolor(19,19,19,"orange");
boxcolor o4=new boxcolor(38,38,38,"Green");

//System.out.println("Volume is: "+o1.volume());
//System.out.println("Weight is: "+o1.weight);


//System.out.println("Volume is: " +o2.volume());
//System.out.println("Weight is: " +o2.weight);


System.out.println("Volume is: " +o3.volume());
System.out.println("Color is: "+o3.col);

System.out.println("Volume is: "+o4.volume());
System.out.println("Color is: "+o4.col);
}
}
