import java.util.Scanner;
public class Program114 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        NumberX nobj=new NumberX();
        int iRet=0;int iValue=0;
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        iRet=nobj.ReverseNumber(iValue);
        System.out.println("Reverse number is: "+ iRet);
        sobj.close();
    }
}
class NumberX
{
    public int ReverseNumber(int iNo)
    {
        int iReverse=0;int  iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            iReverse=(iReverse*10)+iDigit;
            iNo=iNo/10;
        }
        return iReverse;
    }
}