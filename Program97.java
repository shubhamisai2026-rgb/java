import java.util.Scanner;
public class Program97 
{
   public static void main(String args[])
   {
    Scanner sobj=new Scanner(System.in);
      int iNo=0;int i=0;int iMax=0;int sMax=0;int count=0;
      System.out.println("enter your number:");
      iNo=sobj.nextInt();
      int arr[]=new int[iNo];
      for(i=0;i<iNo;i++)
      {
        arr[i]=sobj.nextInt();
      }
      iMax=arr[0];
        for(i=0;i<iNo;i++)
        { 
           if(iMax<arr[i])
           {
            iMax=arr[i];
            count++;
           }
        }
        arr[count]=0;
        sMax=arr[0];
        for(i=0;i<iNo;i++)
        { 
           if(sMax<arr[i])
           {
            iMax=arr[i];
           }
        }
     System.out.println("second max value of array is:"+iMax);
        sobj.close();
   }  
}
