import java.util.Scanner;
public class Program110
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        DigitX dobj=new DigitX();
        int iValue=0;
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        dobj.CountEvenOddDigits(iValue);
        sobj.close();
    }
}
class DigitX
{
    public void CountEvenOddDigits(int iNo)
    {
        int iDigit=0;int iEven=0;int iOdd=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iDigit%2==0)
            {
              iEven++;
            }
            else
            {
                iOdd++;
            }
            iNo=iNo/10;
        }
        System.out.println("number of even digits are: "+iEven);
        System.out.println("number of odd digits are: "+iOdd);
    }
}
