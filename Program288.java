import java.util.Scanner;
public class Program288 
{
    public static void display(int iNo)
    {
      int iCnt=0;
      char ch1='\0';
      char ch2='\0';
      for(iCnt=0,ch1='a',ch2='A';iCnt<iNo;iCnt++,ch1++,ch2++)
      {
        if(iCnt%2==0)
        {
            System.out.print(ch2+"\t");
        }
        else
        {
            System.out.print(ch1+"\t");
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
