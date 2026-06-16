import java.util.Scanner;
public class program227
{
    public static int Summation(int arr[])
    {
      int iCnt=0;int iSum=0;
      for(iCnt=0;iCnt<arr.length;iCnt++)
      {
         iSum=iSum+arr[iCnt];
      }
      return iSum;
    }
    public static void main(String[] args) 
    {
      Scanner sobj=new Scanner(System.in);   
      int iLength=0;int iCnt=0;int iRet=0;
      System.out.println("enter the size of the array is:");
      iLength=sobj.nextInt();
      int arr[]=new int[iLength];
      System.out.println("enter the array of elements:");
      for(iCnt=0;iCnt<arr.length;iCnt++)
      {
        arr[iCnt]=sobj.nextInt();
      }
      System.out.println("elements  of the array is:");
      for(iCnt=0;iCnt<arr.length;iCnt++)
      {
        System.out.println(arr[iCnt]);
      }
      iRet=Summation(arr);
      System.out.println("addition of the array elements: "+iRet);
      sobj.close();
      arr=null;
      System.gc();
    }
}
