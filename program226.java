import java.util.Scanner;

public class program226 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;
        System.out.println("enter the size of the array is:");
        iLength = sobj.nextInt();
        int arr[] = new int[iLength];
        for (iCnt = 0; iCnt < iLength; iCnt++) {
            arr[iCnt] = sobj.nextInt();
        }
        System.out.println("elements of the array is:");
        for (iCnt = 0; iCnt < arr.length; iCnt++) {
            System.out.println(arr[iCnt]);
        }
        Sum sob = new Sum();
        iRet = sob.Summation(arr, iLength);
        System.out.println("addition of the array element is: " + iRet);
        sobj.close();
        arr = null;
        System.gc();
    }
}

class Sum {
    public int Summation(int arr[], int iSize) {
        int iCnt = 0;
        int iSum = 0;
        for (iCnt = 0; iCnt < arr.length; iCnt++) {
            iSum = iSum + arr[iCnt];
        }
        return iSum;
    }
}