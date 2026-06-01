import java.util.Scanner;
public class Program93
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue;
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        NumberX.CheckPattern(iValue);
        sobj.close();
    }
}
class NumberX
{
    public static void CheckPattern(int iNo)
    {
        int iCnt=0;
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
          for(int i=0;i<=iCnt;i++)
          {
            System.out.print("* ");
          }
          System.out.println();
        }
    }
}
