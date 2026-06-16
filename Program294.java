import java.util.Scanner;
public class Program294 
{
    public static void display(int Row,int Col)
    {
       int iVal1;int iVal2;
       for(iVal1=1;iVal1<=Row;iVal1++)
       {
        for(iVal2=1;iVal2<=Col;iVal2++)
        {
            System.out.print(iVal1+"\t");
        }
        System.out.println();
       }
    }
    public static void main(String args[])
    {
        int iNo1=0;int iNo2=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        iNo1=sobj.nextInt();
        System.out.println("enter the number of columns:");
        iNo2=sobj.nextInt();
        display(iNo1,iNo2);
         sobj.close();
    }
}
