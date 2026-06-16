import java.util.Scanner;

public class Program225 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0;
        int iCnt = 0;
        System.out.println("enter the size of the array is:");
        iLength = sobj.nextInt();
        int arr[] = new int[iLength];
        System.out.println("enter the elements in array:");
        for (iCnt = 0; iCnt < iLength; iCnt++) {
            arr[iCnt] = sobj.nextInt();
        }
        System.out.println("elements of the array is:");
        for (iCnt = 0; iCnt < arr.length; iCnt++) {
            System.out.println(arr[iCnt]);
        }
        arr = null;
        System.gc();
        
        sobj.close();
    }
}
