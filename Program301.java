import java.util.Scanner;
class Pattern
{
    public void display(int ino1,int ino2)
    {
        int i=0;int j=0;
        for(i=1;i<=ino1;i++)
        {
            if(i%2==0)
            {
                for(j=1;j<=ino2;j++)
                {
                   System.out.print("#\t");
                }
                System.out.println();
            }
            else
            {
                for(j=1;j<=ino2;j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}
public class Program301 
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);
      int iVal1=0;int iVal2=0;
      System.out.println("enter a number1:");
      iVal1=sobj.nextInt();
      System.out.println("enter a number2:");
      iVal2=sobj.nextInt();
      Pattern pobj=new Pattern();
      pobj.display(iVal1,iVal2);
      sobj.close();
    }
}
