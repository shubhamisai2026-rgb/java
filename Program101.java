import java.util.Scanner;
public class Program101 
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);
      int iValue=0;
      System.out.println("enter a value:");
      iValue=sobj.nextInt();
      NumberX nobj=new NumberX();
      nobj.ReverseNum(iValue);
      sobj.close();
    }
}
class NumberX
{
    public void ReverseNum(int iNo)
    {
        int iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            System.out.print(iDigit);
            iNo=iNo/10;
        }
    }
}
