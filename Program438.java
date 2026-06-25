import java.util.Scanner;


public class Program438 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();

        StringXX sobj2 = new StringXX();
        String Ret = null;
        Ret = sobj2.display(str);

        System.out.println("updated string is:" + Ret);

        sobj.close();
    }
}

class StringXX {
    public String display(String str) {
        int i = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'A') {
                arr[i] = '_';
            }
        }
        String Ret = new String(arr);
        return Ret;
    }
}
