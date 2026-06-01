import java.util.Scanner;
public class Program89
{
  public static void main(String[] args) 
  {
    Scanner sobj=new Scanner(System.in);
    int iValue=0;boolean iRet=false;
    System.out.println("enter your number:");
    iValue=sobj.nextInt();
    iRet=NumberX.CheckArmstrong(iValue);
    if(iRet==true)
    {
        System.out.println("the number is a armstrong......");
    }
    else
    {
        System.out.println("the number is not armstrong.......");
    }
    sobj.close();
  } 
}
class NumberX
{
    public static boolean CheckArmstrong(int iNo)
    {
        int iDigit=0;int iRad=0;int iTemp=0;
        iTemp=iNo;
        while(iNo!=0)
        {
            iRad=iNo%10;
            iDigit=(iRad*iRad*iRad)+iDigit;
            iNo=iNo/10;
        }
        if(iDigit==iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}