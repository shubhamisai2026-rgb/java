import java.util.Scanner;

public class Program231 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0;
        int iCnt = 0;
        System.out.println("enter the size of the array:");
        iLength = sobj.nextInt();
        int arr[] = new int[iLength];
        System.out.println("enter the elements of the array is:");
        for (iCnt = 0; iCnt < arr.length; iCnt++) {
            arr[iCnt] = sobj.nextInt();
        }
        System.out.println("elements of the array is:");
        for (iCnt = 0; iCnt < arr.length; iCnt++) {
            System.out.println(arr[iCnt]);
        }
        //ArrayX aobj = new ArrayX();
        //aobj.update(arr);
        ArrayX.update(arr);
        System.out.println("array elements after updation:");
        for (iCnt = 0; iCnt < arr.length; iCnt++) {
            System.out.println(arr[iCnt]);
        }
        sobj.close();
        arr = null;
        System.gc();

    }
}

class ArrayX {
    public static void update(int arr[]) {
        int iCnt = 0;
        for (iCnt = 0; iCnt < arr.length; iCnt++) {
            arr[iCnt]++;
        }
    }
}
