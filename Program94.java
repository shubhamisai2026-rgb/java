import java.util.Scanner;
public class Program94
{
    public static void main(String[] args)
    {  
        int iNo=0;int iCnt=0;int i=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter your number:");
        iNo=sobj.nextInt();
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            for(i=1;i<=iCnt;i++)
            {
               System.out.print(i+"");
            }
            System.out.println();
        }
        sobj.close();
    }
}
