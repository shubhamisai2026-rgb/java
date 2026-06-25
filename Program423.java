import java.util.Scanner;

public class Program423 
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();
        System.out.println("the string is: " + str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        sobj.close();
    }
}
