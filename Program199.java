import java.util.Scanner;
public class Program199 
{
   public static void main(String[] args) 
   {
    int num1=0;int num2=0;int temp=0;int i=0;
    Scanner sobj=new Scanner(System.in);
    System.out.println("enter a your first number:");
    num1=sobj.nextInt();
    System.out.println("enter a your second number");
    num2=sobj.nextInt();
    int GCD=0;
    int LCM=0;
    if(num1>=num2)
    {
       temp=num2;
    }
    else
    {
        temp=num1;
    }
    for(i=1;i<=temp;i++)
    {
        if(num1%i==0 && num2%i==0)
        {
            GCD=i;
        }
    }
    LCM=(num1*num2)/GCD;
    System.out.println("lcm of two numbers is: "+LCM);
    sobj.close();
   } 
}
