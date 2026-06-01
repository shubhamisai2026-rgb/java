import java.util.Scanner;
public class Program102
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("enter the value:");
        iValue=sobj.nextInt();
        DigitX dobj=new DigitX();
        dobj.Digits(iValue);
         sobj.close();
    }
}
class DigitX
{
    public void Digits(int iNo)
    {
       while(iNo!=0)
       {
        System.out.println(iNo%10);
        iNo=iNo/10;
       }
    }
}