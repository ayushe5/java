import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double marks[][]=new double[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                marks[i][j]=sc.nextDouble();
            }
        }
        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks[i].length;j++)
            {
                if(marks[i][0]>marks[i][1] && marks[i][1]<marks[i][2] && n>0)
                {
                    System.out.print((marks[i][0]+marks[i][2])/2 +" ");
                    break;
                }
                else if(marks[i][1]<marks[i][2] && marks[i][0]<marks[i][1] && n>0)
                {
                    System.out.print((marks[i][1]+marks[i][2])/2);
                    break;
                }
                else if(marks[i][2]<marks[i][0] && marks[i][2]<marks[i][1] && n>0)
                {
                    System.out.print((marks[i][0]+marks[i][1])/2);
                    break;
                }
            }
        }
        }
    }
