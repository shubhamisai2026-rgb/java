import java.util.Scanner;

class Program79 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean iRet = true;
        System.out.println("enter your number:");
        iValue = sobj.nextInt();
        iRet = Number.CheckPrime(iValue);
        if (iRet == true) {
            System.out.println("number is a prime.........");
        } else {
            System.out.println("number is not a prime number...");
        }
        sobj.close();
    }
}

class Number {
    public static boolean CheckPrime(int iNo) {
        int count = 0;
        int i = 1;
        while ((iNo / i) != 0) {
            if (iNo % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}