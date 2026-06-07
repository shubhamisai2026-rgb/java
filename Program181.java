import java.util.Scanner;

public class Program181 {
    public static void main(String[] args) {
        int iDigit = 0;
        int r = 0;
        int iNum = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter a your number:");
        iNum = sobj.nextInt();
        int iTemp = iNum;
        while (iNum != 0) {
            iDigit = iNum % 10;
            r = (iDigit*iDigit*iDigit) +r;
            iNum = iNum / 10;
        }
        if (r == iTemp) {
            System.out.println("you enter number is armstrong...");
        } else {
            System.out.println("your enter number is not armstrong.....");
        }
        sobj.close();
    }
}
