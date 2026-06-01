import java.util.Scanner;
public class Program85
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;int pCount=0;
        System.out.println("ente n number:");
        iValue=sobj.nextInt();
        pCount=NumberX.PrimeCount(iValue);
        System.out.println("largest max number are:"+pCount);
        sobj.close();
    }
}
class NumberX
{
    public  static int PrimeCount(int iNo)
    {
        int iCnt=0;int count=0;int iMax=0;
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
                System.out.print(iCnt);
                 iMax=iCnt;
            }
        }
        return iMax;
    }
}
