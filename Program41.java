import java.util.Scanner;
public class Program41 {
    static void CheckEvenOdd(int iNo)
    {
        if(iNo%2==0)
        {
            System.out.println("number is even.......");
        }
        else
        {
            System.out.println("number is odd........");
        }
    }
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        CheckEvenOdd(iValue);
        sobj.close();
    }
}
