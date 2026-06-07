import java.util.Scanner;
public class Program197
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iNum=0;
        System.out.println("enter a your number:");
        iNum=sobj.nextInt();
        int iSum=0;
        for(int i=1;i<iNum;i++)
        {
          if(iNum%i==0)
          {
            iSum=iSum+i;
          }
        }
        if(iSum==iNum)
        {
            System.out.println("the number is a perfect");
        }
        else
        {
            System.out.println("the number is not a perfect");
        }
        sobj.close();
    }
}
