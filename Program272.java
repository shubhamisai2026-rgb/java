import java.util.Scanner;
public class Program272 
{
    public static void display(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }
    public static void main(String args[])
    {
       Scanner sobj=new Scanner(System.in);
       int iValue=0;
       System.out.println("enter a your value:");
       iValue=sobj.nextInt();
       display(iValue);
       sobj.close();
    }
}
