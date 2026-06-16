import java.util.Scanner;
public class Program296
{
    public static void display(int Row,int Col)
    {
        int iNo1=0;int iNo2=0;
        for(iNo1=1;iNo1<=Row;iNo1++)
        {
          for(iNo2=1;iNo2<=Col;iNo2++)
          {
            if(iNo2%2==0)
            {
                System.out.print("#\t");
            }
            else
            {
                System.out.print("@\t");
            }
          }
          System.out.println();
        }  
    }
    public static void main(String args[])
    {
        int iVal1=0;int iVal2=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        iVal1=sobj.nextInt();
        System.out.println("enter the number of columns:");
        iVal2=sobj.nextInt();
        display(iVal1,iVal2);
        sobj.close();
    }
}
