import java.util.Scanner;
class Pattern
{
    public int i;public int j;
    public Pattern()
    {
      i=0;
      j=0;
    }
    public void display(int Row,int Col)
    {
      for(i=1;i<=Row;i++)
      {
        for(j=1;j<=Col;j++)
        {
            System.out.print("#\t");
        }
         System.out.println();
      }
    }
}
public class Program297
{
    public static void main(String args[])
    {
       Scanner sobj=new Scanner(System.in);
       int iVal1=0;int iVal2=0;
       System.out.println("enter a number of rows:");
       iVal1=sobj.nextInt();
       System.out.println("enter a number of columns:");
       iVal2=sobj.nextInt();
       Pattern pobj=new Pattern();
       pobj.display(iVal1,iVal2);
       sobj.close();
    }
}
