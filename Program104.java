import java.util.Scanner;
public class Program104 
{
    public static void main(String args[])
    {
     Scanner sobj=new Scanner(System.in);
     int iValue=0;
     System.out.println("enter a number:");
     iValue=sobj.nextInt();
     DigitX dobj=new DigitX();
     dobj.Digit(iValue);
     sobj.close();
    }
}
class DigitX
{
    public void Digit(int iNo)
    {
         for(;iNo!=0;iNo=iNo/10)
      {
        int iDigit=0;
        iDigit=iNo%10;
        System.out.println(iDigit);
      }
         
    }
}