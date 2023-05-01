class agg
{
static String city,state;
agg(String city,String state)
{
this.city=city;
this.state=state;
}
}
class student
{
int r;
String n;
agg address;
student(int r,String n,agg address)
{
this.n=n;
this.r=r;
this.address=address;
}
void show()
{
System.out.println(r+" "+n);
System.out.println(agg.city+" "+agg.state);//aggregation
}
public static void main(String[] args)
{
agg o=new agg("kanpur","UP");
student o2=new student(10,"sa",o);
o2.show();
}
}