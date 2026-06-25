import java.util.Scanner;


public class Program445 {
    public static void main(String args[]) {
        String Ret = null;
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string is:");
        str = sobj.nextLine();
        StringX sobj2 = new StringX();
        Ret = sobj2.display(str);
        System.out.println("updated string is:" + Ret);
        sobj.close();
    }
}

class StringX {
    public String display(String str) {
        int i = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] - 32);
        }
        return new String(arr);
    }
}
