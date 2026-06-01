import java.util.Scanner;
class Program113
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        NumberX nobj=new NumberX();
        int iValue=0;int iRet=0;
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        iRet=nobj.SumEvenDigits(iValue);
        System.out.println("sum of even digits is: " + iRet);
        sobj.close();
    }
}
class NumberX
{
    public int SumEvenDigits(int iNo)
    {
        int iSum=0;int iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iDigit%2==0)
            {
                iSum=iSum+iDigit;      
            }
            iNo=iNo/10;
        }
        return iSum;
    }
}