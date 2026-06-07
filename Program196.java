import java.util.*;
public class Program196
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iNum=0;int count=0;
        System.out.println("enter a your number:");
        iNum=sobj.nextInt();
        int arr[]=new int[iNum];
        System.out.println("enter the array elements:");
        for(int i=0;i<iNum;i++)
        {
            arr[i]=sobj.nextInt();
        }
        int iMax=arr[0];
        for(int i=0;i<iNum;i++)
        {
            if(iMax<arr[i])
            {
                iMax=arr[i];
                count=i;
            }
        }
        arr[count]=0;
        int sMax=arr[0];
        for(int i=0;i<iNum;i++)
        {
            if(sMax<arr[i])
            {
                sMax=arr[i];
            }
        }
        System.out.println("second largest value of the array is: "+sMax);
        sobj.close();
    }
}
