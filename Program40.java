import java.util.Scanner;

public class Program40 {
    static void CheckDivisible(int iNo) {
        if ((iNo % 3 == 0) && (iNo % 5 == 0)) {
            System.out.println("number is divisible by 3 & 5......");
        } else {
            System.out.println("number is not divisible by 3 & 5.......");
        }
    }

    public static void main(String args[]) {
        int iValue = 0;
        System.out.println("enter your number:");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();
        CheckDivisible(iValue);
        sobj.close();
    }
}
