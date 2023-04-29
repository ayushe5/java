import java.util.*;
import java.util.Scanner;
import java.lang.String;
import java.io.File;


class IdandPass extends Exception
{
int a=3;
static String s1[]={"admin","123"};
static String s2[][]={{"user1","456"},{"user2","789"},{"user3","aaa"}};
}

//******************************************************************************************
class Login extends IdandPass
{
static int index=-1;
static int l;
static void printt(String a,String b)
{
Scanner sc=new Scanner(System.in);

l=0;
int count=0;


for(int i=0;i<3;i++)
{

if(a.matches(s2[i][0]) && b.matches(s2[i][1]))
{
System.out.println("Login successful\n\n");
System.out.println("Welcome "+a);
l--;
break;
}
else if(a.matches(s1[0]) && b.matches(s1[1]))
{
System.out.println("Login Successful\n\n");
System.out.println("Welcome " +a+"\n");
l++;

break; 
}
else
{
System.out.println("Invalid login credentials");
break;
}
}

}
}
//************************************************************************************************************************

class project extends Login         // main class
{

public static void main(String[] args)   // main function
{
Scanner sc=new Scanner(System.in);
IdandPass id=new IdandPass();
project p8=new project();
int index=-1;
int count=0,count1=0;
int n1=0,n2=0;
int currbal=400000;  
int withd;
String u=null,p=null;

File obj=new File("javaproject.java");

System.out.println("\n****************************************Welcome to the login page*************************************");

System.out.println("\nEnter the username: ");                                                   
 //First asking user to log in
u=sc.nextLine();

System.out.println("Enter the password: ");
p=sc.nextLine();


Login l1=new Login();
l1.printt(u,p);

if(l1.l==1)                                                                                   // If admin login
{


while(count<2)
{
System.out.println("\nSelect the actions you want to take");
System.out.println("Choose 0 for viewing monthly balance");
System.out.println("Choose 1 for withdrawing money");
System.out.println("Choose 2 for logging out\n");

int choice=sc.nextInt();
switch(choice)
{
case 0:
{
System.out.println("Current balance is : " +currbal);
break;
}
case 1:
{
System.out.println("Select the amount to be withdrawn: ");
withd=sc.nextInt();
if(withd<currbal)
{
System.out.println("Amount after withdrawl is: "+(currbal-withd));
currbal=currbal-withd;
}
else
{
throw new ArithmeticException("Insufficient funds");
}break;
}
case 2:
{
count=count+3;
}
}
}
}




else if(l1.l==-1)                                                          //if user login         
{

System.out.println("Select the product you want to buy: ");
System.out.println("OR");
System.out.println("Type done to log out");

String s=sc.nextLine();                                         //SECOND STEP-searching for the product using object of the class
                                                                                 


if(search(s)==0 && s.matches("mobile"))                                                           // For mobile                                                                               
{
mobile m=new mobile();
System.out.println("Select from the given list: \n");
m.print();
try
{
System.out.println("Select the index of the product needed: ");
n1=sc.nextInt();
System.out.println("Select the number of products to be purchased: ");
n2=sc.nextInt();
if(n1>m.n)
{
throw new ArrayIndexOutOfBoundsException("Invalid Input:-");
}}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}                                                     //asking user to enter how many products are to be bought
try
{
if(n2>0 && n2<m.arr[n1][0])
{
System.out.println("\n"+n2+ "Mobiles are purchased");
m.arr[n1][0]=m.arr[n1][0]-n2;
System.out.println(+(n2*m.arr[n1][1])+" Rupees are debited");
currbal=currbal+(n2*m.arr[n1][1]);                     
}
else
{
throw new ArrayIndexOutOfBoundsException("Item out of stock");
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
}

else if(search(s)==1)                                                                         // For laptop
{
laptop la=new laptop();
System.out.println("Select from the given list: \n");
try
{
System.out.println("Select the index of the product needed: ");
n1=sc.nextInt();
System.out.println("Select the number of products to be purchased: ");
n2=sc.nextInt();
if(n1>la.n){
throw new ArrayIndexOutOfBoundsException("Invalid Input:-");
}}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}  
try
{
if(n2>0 && n2<la.arr[n1][0])
{
System.out.println(+n2+" Laptops are purchased");

System.out.println(+(n2*la.arr[n1][1])+" Rupees are debited");
currbal=currbal+(n2*la.arr[n1][1]);
}
else
{
throw new ArrayIndexOutOfBoundsException("Item Out Of Stock");
}

}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
}



else if(search(s)==2)                                                                         // For books                    
{
books bo=new books();
System.out.println("Select from the given list \n");

bo.print();

try
{
System.out.println("Select the index of the product needed: ");
n1=sc.nextInt();
System.out.println("Select the number of products to be purchased: ");
n2=sc.nextInt();
if(n1>bo.n)
{
throw new ArrayIndexOutOfBoundsException("Invalid Input:-");
}
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}  

try
{
if(n2>0 && n2<bo.arr[n1][0])
{
System.out.println(+n2+" books were purchased");
System.out.println(+(n2*bo.arr[n1][1])+" Rupees were debited");
currbal=currbal+(n2*bo.arr[n1][1]);
}
else
{
throw new ArrayIndexOutOfBoundsException("Item out of stock");
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
}




else if(search(s)==3)                                                                        // For utensils
{
utensils ut=new utensils();
System.out.println("Select from the given list \n");

ut.print();
try
{
System.out.println("Select the index of the product needed: ");
n1=sc.nextInt();
System.out.println("Select the number of products to be purchased: ");
n2=sc.nextInt();
if(n1>ut.n);
{
throw new ArrayIndexOutOfBoundsException("Invalid Input:-");
}}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}  
try
{
if(n2>0 && n2<ut.arr[n1][0])

{
System.out.println(+n2+" utensils were purchased");
System.out.println(+(n2*ut.arr[n1][1])+" Rupees were debited");
currbal=currbal+(n2*ut.arr[n1][1]);
}
else
{
System.out.println("Insufficient stock");
throw new ArrayIndexOutOfBoundsException("Item out of stock"); 
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
catch(Exception e)
{
System.out.println("Handled");

}
}

else if(s.matches("done"))
{
count=count+3;
System.out.println("You have successfully logged out");
}







}
}



//**********************************************************************************************************************************************
public static int search(String a)                               // logic for searching products
{  
Scanner sc=new Scanner(System.in);

String prod[]={"mobile","laptop","books","utensils"};
for(int i=0;i<4;i++)
{
if(prod[i].equals(a))
{
return i;
}
}
return 0;
}
}



//*****************************************************************************************************************************************************  

interface PRODUCT
{
public void print();
}


class Product                                                 //unique class having details of products available
{
                                                                 // String i-d array and integer 2-d array storing products avaialble in online shppoing also the number of products left and cost
String p1[]={"mobile","laptop","books","utensils"};
int arr1[]={97,71,185,200};
}

//************************************************************************************
class mobile                                                      // 4 classes holding values of varities and number of stocks
{
int n=8;
String s[]={"oppo","vivo","nokia","samsung","lava","realme","redmi","asus" };
int arr[][]={{14,10000},{20,12000},{3,4000},{14,11000},{25,9000},{6,10000},{7,13000},{8,6000}};
public void print()
{
for(int i=0;i<n;i++) 
{                    
System.out.println(s[i]);
}
}
}
//************************************************************************************
class laptop extends mobile                                                  // Inheritance
{
int n=4;
String s[]={"asus","lenovo","dell","hp"};
int arr[][]={{20,50000},{17,40000},{18,70000},{16,30000}};
public void print()
{
for(int i=0;i<4;i++)
{
System.out.println(s[i]);
}
}
}
//************************************************************************************
class books extends mobile
{
int n=6;
String s[]={"science","literature","novel","history","magazine","current affairs"};
int arr[][]={{40,300},{60,600},{10,2000},{30,300},{20,450},{25,300}};
public void print()
{
for(int i=0;i<n;i++)
{
System.out.println(s[i]);
}
}
}
//*************************************************************************************
class utensils extends mobile
{
int n=3;
String s[]={"Cup","Plates","Pan"};
int arr[][]={{30,100},{150,120},{20,500}};
public void print()
{
for(int i=0;i<n;i++)
{
System.out.println(s[i]);
}
}
}

