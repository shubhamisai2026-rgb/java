import java.util.Scanner;
public class Program103 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        NumberX nobj=new NumberX();
        nobj.DisplayDigits(iValue);
        sobj.close();
    }
}
class NumberX
{
    public void DisplayDigits(int iNo)
    {
      int iDigits=0;
      for(;iNo!=0;)
      {
        iDigits=iNo%10;
        System.out.println(iDigits);
        iNo=iNo/10;
      }

    }
}