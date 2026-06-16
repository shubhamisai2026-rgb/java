import java.util.Scanner;
public class Program295 
{
    public static void display(int Row,int Col)
    {
      int iNo1=0;int iNo2=0;
      for(iNo1=1;iNo1<=Row;iNo1++)
      {
        for(iNo2=1;iNo2<=Col;iNo2++)
        {
            if(iNo1%2==0)
            {
                System.out.print("$\t");
            }
            else
            {
                System.out.print("*\t");
            }
        }
        System.out.println();
      }
    }
    public static void main(String args[])
    {
        int iValue1=0;int iValue2=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        iValue1=sobj.nextInt();
        System.out.println("enter the number of column:");
        iValue2=sobj.nextInt();
        display(iValue1,iValue2);
        sobj.close();
    }
}