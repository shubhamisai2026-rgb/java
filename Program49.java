import java.util.Scanner;
class Program49
{
    public static void main(String[] args) 
    {
         Scanner sobj=new Scanner(System.in);
         int iValue=0;boolean iRet=false;
         System.out.println("enter your number:");
         iValue=sobj.nextInt();
         //NumberX nobj=new NumberX();
         //iRet=nobj.CheckPerfectNumber();
         iRet=NumberX.CheckPerfectNumber(iValue);
         if(iRet==true)
         {
            System.out.println("number is a perfect......");
         }
         else
         {
            System.out.println("number is not a perfect......");
         }
         sobj.close();
    }
}
class NumberX
{
    public static boolean CheckPerfectNumber(int iNo)
    {
        int iSum=0;
        int i=0;
        for(i=1;i<=(iNo/2);i++)
        {
            if(iNo%i==0)
            {
                iSum=i+iSum;
            }
        }
        if(iSum==iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}