import java.util.Scanner;
public class program112 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        DigitX dobj=new DigitX();
        int iValue=0;int iRet=0;
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        iRet=dobj.SumDigits(iValue);
        System.out.println("sum of the digits is: "+iRet);
        sobj.close();
    }
}
class DigitX
{
    public int SumDigits(int iNo)
    {
        int iSum=0;
        while(iNo!=0)
        {
            iSum=iSum+(iNo%10);
            iNo=iNo/10;
        }
        return iSum;
    }
}