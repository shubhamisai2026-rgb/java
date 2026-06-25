import java.util.Scanner;

public class program425 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();
        System.out.println("the string is: " + str);
        System.out.println("length of the string is:" + str.length());
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        sobj.close();
    }
}
