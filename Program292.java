import java.util.*;
public class Program292 
{
    public static void display(int iVal1,int iVal2)
    {
       int i=0;int j=0;
       for(i=1;i<=iVal1;i++)
       {
        for(j=1;j<=iVal2;j++)
        {
          System.out.print("*\t");
        }
        System.out.println();
       }
    }
    public static void main(String args[])
    {
        int iNo1;int iNo2;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter a number of rows:");
        iNo1=sobj.nextInt();
        System.out.println("enter the number of columns:");
        iNo2=sobj.nextInt();
        display(iNo1,iNo2);
        sobj.close();
    }
}
