import java.util.Scanner;
public class Program230 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iLength=0;int iCnt=0;
        System.out.println("enter the size of the array is:");
        iLength=sobj.nextInt();
        int arr[]=new int[iLength];
        System.out.println("enter the elements of the array is:");
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
          arr[iCnt]=sobj.nextInt();
        }      
        System.out.println("elements of the array is:");
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            System.out.println(arr[iCnt]);
        }
        ArrayX.update(arr);
        System.out.println("array is later updation:");
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            System.out.println(arr[iCnt]);
        }
        sobj.close();
        arr=null;
        System.gc();
    }
}
class ArrayX
{
    public static void update(int arr[])
    {
        int iCnt=0;
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
           arr[iCnt]++;
        }
    }
}
