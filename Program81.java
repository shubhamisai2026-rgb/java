import java.util.Scanner;
public class Program81 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;int pCount=0;
        System.out.println("ente n number:");
        iValue=sobj.nextInt();
        pCount=NumberX.PrimeCount(iValue);
        System.out.println("total prime number in 1 to 100:"+pCount);
        sobj.close();
    }
}
class NumberX
{
    public  static int PrimeCount(int iNo)
    {
        int iCnt=0;int count=0;int pCount=0;
        for(iCnt=2;iCnt<=iNo;iCnt++)
        {
            count=0;
            for(int i=1;i<=iCnt;i++)
            {
                if(iCnt%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                pCount++;
            }
        }
        return pCount;

    }
}
