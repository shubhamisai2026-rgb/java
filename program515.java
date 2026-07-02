import java.util.Scanner;

public class program515 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("enter a your number:");
        num1 = sobj.nextInt();
        System.out.println("enter a second number:");
        num2 = sobj.nextInt();
        MaxNumber mobj = new MaxNumber();
        mobj.display(num1, num2);
        sobj.close();
    }
}

class MaxNumber 
{
    public void display(int num1, int num2)
    {
     if(num1>num2)
     {
        System.out.println("num1 is the greater...");
     }
     else
     {
        System.out.println("num2 is the greater...");
     }
    }
}