import java.util.Scanner;

public class Program428 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        // System.out.println("the length of the string is: " + str.length());
        System.out.println("enter a your string:");
        str = sobj.nextLine();
        System.out.println("the string is: " + str);
        System.out.println("the length of the string is: " + str.length());
        sobj.close();

    }
}
