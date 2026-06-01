import java.util.Scanner;
public class Program90
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;int iRet=0;
        System.out.println("enter the your number:");
        iValue=sobj.nextInt();
        iRet=NumberX.FactorialNumber(iValue);
        System.out.println("the factourial of " + iValue + "  is  " + iRet);
        sobj.close();
    }
}
class NumberX
{
    public static int FactorialNumber(int iNo)
    {
        int iSum=1;int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            iSum=iCnt*iSum;
        }
        return iSum;
    }
}