import java.util.Scanner;
public class Program88
{
    public static void main(String args[])
    {
       int iValue=0;
       boolean iRet=false;
       Scanner sobj=new Scanner(System.in);
       System.out.println("enter the number:");
       iValue=sobj.nextInt();
       iRet=NumberX.CheckPalindrone(iValue);
       if(iRet==true)
       {
        System.out.println("the given number is palindrome.....");
       }
       else
       {
        System.out.println("the number is not a palindrome........");
       }
       sobj.close();
    }
}
class NumberX
{
    public static boolean CheckPalindrone(int iNo)
    {
        int iTemp=0;
        iTemp=iNo;int iSum=0;int iRad=0;
        while(iNo!=0)
        {
        iRad=iNo%10;
        iSum=(iSum*10)+iRad;
        iNo=iNo/10;
        }
        if(iSum==iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}