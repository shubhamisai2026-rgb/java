import java.util.Scanner;
public class Program50
{
    public static void main(String args[])
    {
       Scanner sobj=new Scanner(System.in);
       int iValue=0;
       System.out.println("enter your number:");
       iValue=sobj.nextInt();
       NumberX.SumFactors(iValue);
       sobj.close();
    }
}
class NumberX
{
    public static void SumFactors(int iNo) 
    {
        int i=0;
        int iSum=0;
        for(i=1;i<=(iNo/2);i++)
        {
            if(iNo%i==0)
            {
            iSum=iSum+i;
            }
        }
      System.out.println("addition factors are:"+iSum);
    }
}
