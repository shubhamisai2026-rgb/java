import java.util.Scanner;
public class Program115
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        Number nobj=new Number();
        int iValue=0;boolean iRet=false;
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        iRet=nobj.CheckPalindrome(iValue);
        if(iRet==true)
        {
            System.out.println("this is the palindrome number.......");
        }
        else
        {
            System.out.println("this is not the palindrome number.......");
        }
        sobj.close();
    }
}
class Number
{
    public boolean CheckPalindrome(int iNo)
    {
        int iDigit=0;int iReverse=0;int iTemp=0;
        iTemp=iNo;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            iReverse=(iReverse*10)+iDigit;
            iNo=iNo/10;
        }
        if(iTemp==iReverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
