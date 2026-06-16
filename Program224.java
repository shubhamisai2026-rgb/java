import java.util.*;
public class Program224
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iLength=0;int iCnt=0;
        System.out.println("enter the size of array:");
        iLength=sobj.nextInt();
        int arr[]=new int[iLength];
        System.out.println("enter the array elements:");
        for(iCnt=0;iCnt<iLength;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }
       System.out.println("elements of the array is:");
       for(iCnt=0;iCnt<iLength;iCnt++)
       {
        System.out.println(arr[iCnt]);
       }
       sobj.close();
    }
}
