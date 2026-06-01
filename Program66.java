import java.util.Scanner;

public class Program66{
    public static void main(String[] args)
    {
      Scanner sobj=new Scanner(System.in);
      int iValue=0;boolean iRet=false;
      System.out.println("enter a number:");
      iValue=sobj.nextInt();
      iRet=NumberX.CheckPrime(iValue);
      if(iRet==true)
      {
        System.out.println("the number is a prime......");
      }
      else
      {
        System.out.println("the number is not a prime...");
      }
      sobj.close();
    }
}

class NumberX {
    public static boolean CheckPrime(int iNo) {
        int iCnt = 0;
        for (iCnt = 2; iCnt <= (iNo / 2); iCnt++) {
            if ((iNo%iCnt) == 0) {
                break;
            }
        }
        if (iCnt<(iNo/2)) {
            return false;
        } else {
            return true;
        }
    }
}