import java.util.Scanner;
class Program281
{
    public static void display(int iNo)
    {
        int iCnt=0;
        char ch='\0';
        for(iCnt=0,ch=97;iCnt<iNo;iCnt++,ch++)
        {
          System.out.print(ch+"\t");
        }
    }
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("enter a your value:");
        iValue=sobj.nextInt();
        display(iValue);
        sobj.close();
    }
}