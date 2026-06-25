import java.util.Scanner;

public class Program437 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();

        StringX sobj2 = new StringX();
        int Ret = sobj2.Capital(str);
        System.out.println("frequency of the capital is:" + Ret);

        Ret = sobj2.Small(str);
        System.out.println("frequency of the small is:" + Ret);

        Ret = sobj2.Digit(str);
        System.out.println("frequency of the digit is:" + Ret);

        Ret = sobj2.Space(str);
        System.out.println("frequency of the space is:" + Ret);

        Ret = sobj2.Special(str);
        System.out.println("frequency of the special is:" + Ret);

        sobj.close();
    }
}

class StringX {
    public int Capital(String str) {
        int i = 0;
        int count = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public int Small(String str) {
        int i = 0;
        int count = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                count++;
            }
        }
        return count;
    }

    public int Digit(String str) {
        int i = 0;
        int count = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                count++;
            }
        }
        return count;
    }

    public int Space(String str) {
        int i = 0;
        int count = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                count++;
            }
        }
        return count;
    }

    public int Special(String str) {
        int i = 0;
        int count = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == '!' || arr[i] == '@' || arr[i] == '#' || arr[i] == '$'
                    || arr[i] == '%' || arr[i] == '^' || arr[i] == '&' || arr[i] == '*') {
                count++;
            }
        }
        return count;
    }
}
