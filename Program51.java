import java.util.Scanner;
public class Program51 
{
    public static void main(String[] args) 
    {
       Scanner sobj=new Scanner(System.in);
       int iValue=0;boolean iRet=false;
       System.out.println("enter your number:");
       iValue=sobj.nextInt();
       iRet=NumberX.CheckPerfect(iValue);
       if(iRet==true)
        {
            System.out.println("the number is a perfect......");
        }  
        else
        {
            System.out.println("the number is not a perfect.......");
        }
        sobj.close();
    }
}
class NumberX
{
    public static boolean CheckPerfect(int iNo)
    {
        int i=0;int iSum=0;
        for(i=1;i<=(iNo/2);i++)
        {
            if(iNo%i==0)
            {
                iSum=i+iSum;
            }
            if(iSum>iNo)
            {
                break;
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
