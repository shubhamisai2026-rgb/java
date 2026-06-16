import java.util.Scanner;
public class Program290 
{
    public static void display(int iNo)
    {
        int iCnt=0;
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            System.out.print("*\t");
        }
        System.out.println();
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            System.out.print("*\t");
        }
        System.out.println();
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            System.out.print("*\t");
        }
    }
public static void main(String args[])
{
    int iValue=0;
    Scanner sobj=new Scanner(System.in);
    System.out.println("enter a your number:");
    iValue=sobj.nextInt();
    display(iValue);
    sobj.close();
}
}
