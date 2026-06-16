import java.util.Scanner;
public class Program276
{
    public static void display(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.print("*\t");
            }
            else
            {
            System.out.print(iCnt+"\t");
            }
        }
    }
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);
      int iValue=0;
      System.out.println("enter a youe value:");
      iValue=sobj.nextInt();
      display(iValue);
      sobj.close();
    }
}
