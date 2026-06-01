import java.util.Scanner;
public class Program98 
{
    public static void main(String[] args) 
    {
        int iNo=0;int i=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        iNo=sobj.nextInt();
        int arr[]=new int[iNo];
        for(i=0;i<iNo;i++)
        {
            arr[i]=sobj.nextInt();
        }
        System.out.println("reverse array:");
        for(i=iNo-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        sobj.close();
    }
}
