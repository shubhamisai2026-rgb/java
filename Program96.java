import java.util.Scanner;
public class Program96
{
    public static void main(String[] args) 
    {
        int iNo=0;int i=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the number of array:");
        iNo=sobj.nextInt();
        int arr[]=new int[iNo];
        int iMax=0;
        for( i=0;i<iNo;i++)
        {
            arr[i]=sobj.nextInt();
        }
       iMax=arr[0];
        for(i=0;i<iNo;i++)
        { 
           if(iMax<arr[i])
           {
            iMax=arr[i];
           }
        }
    
        System.out.println("max value of array is:"+iMax);
        sobj.close();
    }
}
