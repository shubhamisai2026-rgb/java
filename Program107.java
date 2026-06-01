import java.util.Scanner;
public class Program107
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);
      NumberX nobj=new NumberX();
      int iValue=0;int iRet=0;
      System.out.println("enter your number:");
      iValue=sobj.nextInt();
      iRet=nobj.CountDigits(iValue);
      System.out.println("total digits: "+iRet);
      sobj.close();
    }
}
class NumberX
{
    public int CountDigits(int iNo)
    {
        int iDigit=0;int iCount=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iDigit==7)
            {
                iCount++;
            }
            iNo=iNo/10;
        }
        return iCount;
    }

}
