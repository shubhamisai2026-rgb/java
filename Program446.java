import java.util.Scanner;


public class Program446 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();
        StringX sobj2 = new StringX();
        String Ret = null;
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
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 32);
            }
        }
        return new String(arr);
    }
}
