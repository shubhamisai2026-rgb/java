import java.util.Scanner;
public class Program422 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();
        program440 sobj2 = new program440();
        int Ret = 0;
        Ret = sobj2.display(str);
        System.out.println("frequency: " + Ret);
        sobj.close();
    }
}


class StringX {
    public int display(String str) {
        int i = 0;
        int count = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

                count++;
            }
        }
        return count;
    }
}

