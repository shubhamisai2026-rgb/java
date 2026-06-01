import java.util.Scanner;
public class Program106 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        NumberX nobj=new NumberX();
        int iValue=0;int iRet=0;
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        iRet=nobj.CountDigits(iValue);
        System.out.println("total digits of number is: " + iRet);
        sobj.close();
    }
}
class NumberX
{
    public int CountDigits(int iNo)
    {
         int iCount=0 ;
        while(iNo!=0)
        {
        iCount++;
        iNo=iNo/10;
        }
        return iCount;
    }
}