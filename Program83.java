import java.util.Scanner;

class Program83{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean iRet = true;
        System.out.println("enter your number:");
        iValue = sobj.nextInt();
        iRet = Number.CheckComposite(iValue);
        if (iRet == true) {
            System.out.println("number is a composite.........");
        } else {
            System.out.println("number is not a composite........");
        }
        sobj.close();
    }
}

class Number {
    public static boolean CheckComposite(int iNo) {
        int count = 0;
        int i = 1;
        while ((iNo / i) != 0) {
            if (iNo % i == 0) {
                count++;
            }
            i++;
        }
        if (count > 2) {
            return true;
        } else {
            return false;
        }
    }
}