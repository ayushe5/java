import java.util.Scanner;
enum days
{
    Monday("8:30 5:30"),
    Tuesday("8:30 5:30"),
    Wednesday("8:30 5:30"),
    Thursday("8:30 5:30"),
    Friday("8:30 5:30"),
    Saturday("9:30 4:30");
    
    private String s;
    private days(String s)
    {
        this.s=s;
    }
    public String getS()
    {
        return s;
    }
}
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String d=sc.nextLine();
        switch(d)
        {
            case "Monday":
                {
                    days M=days.Monday;
                    System.out.println(M.getS());
                    break;
                }
            case "Tuesday":
                {
                    days T=days.Tuesday;
                    System.out.println(T.getS());
                    break;
                }
            case "Wednesday":
                {
                    days W=days.Wednesday;
                    System.out.println(W.getS());
                    break;
                }
            case "Thursday":
                {
                    days Th=days.Thursday;
                    System.out.println(Th.getS());
                    break;
                }
            case "Friday":
                {
                    days F=days.Friday;
                    System.out.println(F.getS());
                    break;
                }
            case "Saturday":
                {
                    days S=days.Saturday;
                    System.out.println(S.getS());
                    break;
                }
            default:
                {
                    System.out.println("Library is closed");
                    break;
                }
        }
    }
}
