import java.util.Scanner;
public class Program277 
{
    public static void display(int iNo)
    {
        int iCnt=0;
        int iCount=0;
        for(iCnt=1,iCount=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iCount+"\t");
                iCount++;
            }
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
