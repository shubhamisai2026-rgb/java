import java.util.Scanner;

public class Program82 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);
    int iValue = 0;
    int iRet = 0;
    System.out.println("enter a value:");
    iValue = sobj.nextInt();
    iRet = NumberX.SumPrime(iValue);
    System.out.println("addition of prime numbers:" + iRet);
    sobj.close();
  }

}
class NumberX {
  public static int SumPrime(int iNo) {
    int iCnt = 0;
    int count = 0;
    int iSum = 0;

    for (iCnt = 2; iCnt <= iNo; iCnt++) {
      count = 0;
      for (int i = 1; i <= iCnt; i++) {
        if (iCnt % i == 0) {
          count++;
        }
      }
      if (count == 2) {
        iSum = iCnt + iSum;
      }
    }

    return iSum;
  }
}
