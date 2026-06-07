import java.util.Scanner;
public class Program195 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int a=0;int b=0;
        System.out.println("enter a number a:");
        a=sobj.nextInt();
        System.out.println("enter a number b:");
        b=sobj.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
        sobj.close();
    }
}
