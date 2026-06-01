import java.util.Scanner;
public class Program42 
{
  public static void CheckPrimeNumber(int iNo)
  {
    int count=0;
    int i=0;
    for(i=1;i<=iNo;i++)
    {
        if(iNo%i==0)
        {
            count++;
        }
    }
        if(count==2)
        {
            System.out.println("the given number is prime......");
        }
        else
        {
            System.out.println("the given number is not a prime......");
        }
    }
  
public static void main(String[] args) 
{
    Scanner sobj=new Scanner(System.in);
    int iValue=0;
    System.out.println("enter your number:");
    iValue=sobj.nextInt();
    CheckPrimeNumber(iValue);
    sobj.close();
}
}
