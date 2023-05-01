import java.util.Scanner;

enum subjects
{
    NAME1("Md. Adil Khan"),
    NAME2("James William"),
    NAME3("Puneet Kumar"),
    NAME4("Shruti"),
    CREDIT1("3"),
    CREDIT2("2"),
    CREDIT3("3"),
    CREDIT4("4");
    private String s;
    private subjects(String s)
    {
        this.s=s;
    }
    public String getS()
    {
        return s;
    }
}
public class AB
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        switch(n)
        {
            case "Android":
                {
                    subjects l=subjects.NAME1;
                    subjects l1=subjects.CREDIT1;
                    System.out.println(l.getS()+" "+l1.getS());
                    break;
                }
            case "AI":
            {
                subjects l2=subjects.NAME2;
                subjects l3=subjects.CREDIT2;
                System.out.println(l2.getS()+" "+l3.getS());
                break;
            }
            case "OS":
                {
                    subjects l4=subjects.NAME3;
                    subjects l5=subjects.CREDIT3;
                    System.out.println(l4.getS()+" "+l5.getS());
                    break;
                }
            case "JAVA":
                {
                    subjects l6=subjects.NAME4;
                    subjects l7=subjects.CREDIT4;
                    System.out.println(l6.getS()+" "+l7.getS());
                    break;
                }
            default:
                {
                    System.out.println("This subject is not running in this semester.");
                    break;
                }
        }
    }
}
