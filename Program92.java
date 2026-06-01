import java.util.Scanner;
public class Program92
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;int iRet=0;
        System.out.println("enter a number:");
        iValue=sobj.nextInt();
        iRet=NumberX.CountDigits(iValue);
        System.out.println("digits of the number is: "+ iRet);
        sobj.close();
    }
}
class NumberX
{
    public static int CountDigits(int iNo)
    {
        int count=0;
        while(iNo!=0)
        {
            iNo=iNo/10;
            count++;
        }
        return count;
    }
}
