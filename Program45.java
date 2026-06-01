import java.util.Scanner;
public class Program45 
{
    public static void main(String[] args) 
    {
    Scanner sobj=new Scanner(System.in);
    int iValue=0;boolean iRet=false;
    System.out.println("enter your number:");
    iValue=sobj.nextInt();
   // NumberX nobj=new NumberX();
    //iRet=nobj.CheckDivisible(iValue);
    iRet=NumberX.CheckDivisible(iValue);
    if(iRet==true)
    {
        System.out.println("number is divisible by 4 and 5");
    }
    else
    {
        System.out.println("number is not divisible by 4 and 5");
    }
    sobj.close();
    
    }
}

class NumberX
{
    public static boolean CheckDivisible(int iNo)
    {
        if((iNo%4==0) && (iNo%5==0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    

}
