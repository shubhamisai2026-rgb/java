import java.util.Scanner;
public class Program204
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int num=0;int i=0;int temp=0;int j=0;
        System.out.println("enter a number:");
        num=sobj.nextInt();
        int arr[]=new int[num];
        System.out.println("enter a array elements:");
        for(i=0;i<num;i++)
        {
            arr[i]=sobj.nextInt();
        }
        for(i=0;i<num-1;i++)
        {
            for(j=i+1;j<num;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("array ascending order:");
        for(i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("array descening order:");
        for(i=num-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
         sobj.close();
    }
}
