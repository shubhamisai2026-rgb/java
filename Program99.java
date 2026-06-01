import java.util.Scanner;
public class Program99
{
   public static void main(String args[])
   {
    Scanner sobj=new Scanner(System.in);
      int iNo=0;int i=0;int j=0;
      System.out.println("enter your number:");
      iNo=sobj.nextInt();
      int arr[]=new int[iNo];
      for(i=0;i<iNo;i++)
      {
        arr[i]=sobj.nextInt();
      }
      for(i=0;i<iNo;i++)
      {
        for(j=i+1;j<iNo;j++)
        {
          if(arr[i]==arr[j])
          {
            System.out.println("duplicate element is: "+arr[i]);
          }
        }
      }
      sobj.close();
    }
  }