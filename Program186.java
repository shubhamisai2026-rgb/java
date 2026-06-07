import java.util.Scanner;
public class Program186 
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iNo=0;int iCnt=0;boolean found=false;int key=0;
        System.out.println("enter a your number:");
        iNo=sobj.nextInt();
        int arr[]=new int[iNo];
        System.out.println("enter the array element:");
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }  
       System.out.println("enter the element of array:");
       key=sobj.nextInt();
       for(iCnt=0;iCnt<iNo;iCnt++)
       {
        if(key==arr[iCnt])
        {
           found=true;
           break;
        }
       }
       if(found)
       {
        System.out.println("element found");
       }
       else
       {
        System.out.println("element not found");
       }
       sobj.close();
    }
}
