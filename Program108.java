import java.util.Scanner;
public class Program108 
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);
      DigitX dobj=new DigitX();
      int iValue=0;int iRet=0;
      System.out.println("enter the number:");
      iValue=sobj.nextInt();
      iRet=dobj.CountEvenDigits(iValue);
      System.out.println("even digits of number is: " + iRet);
      sobj.close();
    }
}
class DigitX
{
    public int CountEvenDigits(int iNo)
    {
        int iDigit=0;int iCount=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iDigit%2==0)
            {
                iCount++;
            }
            iNo=iNo/10;
        }
        return iCount;
    }
}
