import java.util.Scanner;


class Program513 {
    public static void main(String args[]) {
        int number = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter a your number:");
        number = sobj.nextInt();
        SumDigits sobj2 = new SumDigits();
        int iRet = 0;
        iRet = sobj2.Display(number);
        System.out.println("addition of the digits is:" + iRet);
        sobj.close();
    }
}

class SumDigits {
    public int Display(int iNo) {
        int iDigit = 0;
        int iSum = 0;
        while (iNo != 0) {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}
