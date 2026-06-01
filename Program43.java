import java.util.Scanner;

public class Program43 {
    public static boolean CheckDivisible(int iNo) {
        if ((iNo % 3 == 0) && (iNo % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int iValue=0;boolean iRet;
        System.out.println("enter your number:");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        iRet=CheckDivisible(iValue);
        if(iRet==true)
        {
         System.out.println("divisible 3 and 5");
        }
        else
        {
            System.out.println("not divisible 3 and 5");
        }
        sobj.close();
    }
}