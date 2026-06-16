import java.util.Scanner;
public class Program286 
{
    public static void display(int iNo)
    {
        int iCnt=0;
        char ch='\0';
        for(iCnt=1,ch='A';iCnt<=iNo;iCnt++,ch++)
        {
            if(iCnt%2==0)
            {
          System.out.print(iCnt+"\t");
            }
            else
            {
                System.out.print(ch+"\t");
            }
        }
    }
    public static void main(String args[])
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter a your value:");
        iValue=sobj.nextInt();
        display(iValue);
        sobj.close();
    }
}
