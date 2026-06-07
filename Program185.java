import java.util.Scanner;
public class Program185 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iNo=0;int iCnt=0;
        System.out.println("enter a your number:");
        iNo=sobj.nextInt();
        int arr[]=new int[iNo];
        System.out.println("enter a array elements:");
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }
        int iMin=arr[0];
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            if(iMin>arr[iCnt])
            {
                iMin=arr[iCnt];
            }
        }
        System.out.println("minimum element of array is: "+iMin);
        sobj.close();
    }
}
