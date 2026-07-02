import java.util.Scanner;

public class Program514 {
    public static void main(String args[]) {
        int iNo = 0;
        boolean iRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter a your number:");
        iNo = sobj.nextInt();
        Palindrome pobj = new Palindrome();
        iRet = pobj.Display(iNo);
        if (iRet == true) {
            System.out.println("this is the palindrome number...");
        } else {
            System.out.println("this is not palindrome number....");
        }
        sobj.close();
    }
}

class Palindrome {
    public boolean Display(int iNo) {
        int iDigit = 0;
        int temp=iNo;
        int iSum = 0;
        while (iNo != 0) {
            iDigit = iNo % 10;
            iSum = iSum * 10 + iDigit;
            iNo = iNo / 10;
        }
        if (iSum == temp) {
            return true;
        } else {
            return false;
        }
    }
}