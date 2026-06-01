import java.util.Scanner;
public class Program87 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        NumberX.ReverseNumber(iValue);
        sobj.close();
    }
}
class NumberX
{
    public static void ReverseNumber(int iNo)
    {
        int iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            System.out.print(iDigit);
            iNo=iNo/10;
        }
    }
}
