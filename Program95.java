import java.util.Scanner;
public class Program95 
{
    public static void main(String[] args) 
    {
        int iCnt=0;int i=0;
        int iNo=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter your number:");
        iNo=sobj.nextInt();
        for(iCnt=iNo;iCnt>=0;iCnt--)
        {
            for(i=0;i<=iCnt;i++)
            {
              System.out.print("* ");
            }
            System.out.println();
        }
        sobj.close();
    }
}
