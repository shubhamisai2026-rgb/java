import java.util.Scanner;
public class Program100
{
public static void main(String[] args)
{
    int iNo=0;
    Scanner sobj=new Scanner(System.in);
    System.out.println("enter the number of elements in array:");
    iNo=sobj.nextInt();
    Number nobj=new Number();
    nobj.SortArray(iNo);
    sobj.close();
}
    
}
class Number
{
    public void SortArray(int iNo)
    {
     Scanner sobj=new Scanner(System.in);
        int arr[]=new int[iNo];
        int i=0;int j=0;int temp=0;
        for(i=0;i<iNo;i++)
        {
            arr[i]=sobj.nextInt();
        }
        for(i=0;i<iNo;i++)
        {
            for(j=i+1;j<iNo;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(i=0;i<iNo;i++)
        {
            System.out.println(arr[i]);
        }
        sobj.close();
    }
}