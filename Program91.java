import java.util.Scanner;

public class Program91 
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("enter a number:");
        iValue=sobj.nextInt();
        NumberX.FibnoccisSeries(iValue);
        sobj.close();
    }
}
class NumberX
{
    public static void FibnoccisSeries(int iNo)
    {
        System.out.println("the fibnoccis series is:");
        int iFib=0;int iCnt=0;
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            iFib=iFib+iCnt;
            System.out.println(iFib);
        }
    }
}