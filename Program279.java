import java.util.Scanner;
public class Program279 
{
    public static void display(int iNo)
    {
        int iCnt=0;
        char ch='a';
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            System.out.print(ch+"\t");
            ch++;
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
