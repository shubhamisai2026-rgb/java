import java.util.Scanner;
public class Program86 {
    public static void main(String args[]) {
        int year=0;boolean iRet=false;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter your year:");
        year=sobj.nextInt();
        iRet=NumberX.CheckLeap(year);
        if(iRet==true)
        {
            System.err.println("this is the leap year.....");
        }
        else
        {
            System.out.println("this is not a leap year....");
        }
        sobj.close();
    }
}

class NumberX {
    public static boolean CheckLeap(int year) {
        if (((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}