import java.util.Scanner;
class Pattern
{
    public void display(int iNo1,int iNo2)
    {
       int i=0;int j=0;
       for(i=1;i<=iNo1;i++)
       {
        for(j=1;j<=iNo2;j++)
        {
            System.out.print(j+"\t");
        }
        System.out.println();
       }
    }
}
public class Program299
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);
      int iVal1=0;int iVal2=0;
      System.out.println("enter the number of rows:");
      iVal1=sobj.nextInt();
      System.out.println("enter the number of columns:");
      iVal2=sobj.nextInt();
      Pattern pobj=new Pattern();
      pobj.display(iVal1,iVal2);
      sobj.close();
    }
}
