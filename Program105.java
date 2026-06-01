import java.util.Scanner;
public class Program105
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;int iRet=0;
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        DigitX dobj=new DigitX();
        iRet=dobj.CountDisplay(iValue);
        System.out.println("total digits of a number: "+iRet);
        sobj.close();
    }
}
class DigitX
{
    public int CountDisplay(int iNo)
    {
       int count=0;
        while(iNo!=0)
        {
             int iDigit=0;
           iDigit=iNo%10;
           System.out.println(iDigit);
            count++;
            iNo=iNo/10;
        }
        return count;
    }
}
