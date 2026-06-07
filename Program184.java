import java.util.Scanner;
public class Program184 
{
    public static void main(String[] args) 
    {
        int iNo=0;int iSum=0;int iCnt=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter a your number:");
        iNo=sobj.nextInt();
        int arr[]=new int[iNo];
        System.out.println("enter a array elements:");
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            iSum=iSum+arr[iCnt];
        }
        System.out.println("addition of array elements is: "+iSum);
        sobj.close();
    }
}
