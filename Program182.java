import java.util.Scanner;

public class Program182 {
    public static void main(String args[]) {
        int iNum = 0;
        int iEven = 0;
        int iOdd = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter a your number:");
        iNum = sobj.nextInt();
        for (int iCnt = 0; iCnt < iNum; iCnt++) {
            if (iCnt % 2 == 0) {
                iEven++;
            } else {
                iOdd++;
            }
        }
        System.out.println("total number of even: " + iEven);
        System.out.println("total numbers of odd: " + iOdd);
        sobj.close();
    }

}
