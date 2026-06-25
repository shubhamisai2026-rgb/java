import java.util.Scanner;

public class Program430 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter the your string:");
        str = sobj.nextLine();
        StringX sobj2 = new StringX();
        sobj2.display(str);
        sobj.close();
    }
}

class StringX {
    public void display(String str) {
        System.out.println("the string is:" + str);
    }
}
