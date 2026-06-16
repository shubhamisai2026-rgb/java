import java.util.Scanner;
public class Program274
{
    public static void display(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print(iCnt+"\t*\t");
        }
    }
    public static void main()
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("enter a your value:");
        iValue=sobj.nextInt();
        display(iValue);
        sobj.close();
    }
}
