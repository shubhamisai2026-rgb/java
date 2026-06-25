import java.util.Scanner;

public class Program421 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter the your string:");
        str = sobj.nextLine();
        System.out.println("the string is " + str);
        //System.out.println(str[0]);
        sobj.close();
    }
}
