import java.util.Scanner;

public class Program435 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();
        Capital cobj = new Capital();
        int Ret = cobj.display(str);
        System.out.println("frequency of the capital is: " + Ret);

        Small sobj2 = new Small();
        Ret = sobj2.display(str);
        System.out.println("frequency of the small: " + Ret);

        Digit dobj = new Digit();
        Ret = dobj.display(str);
        System.out.println("frequency of the digit: " + Ret);

        Space sobj3 = new Space();
        Ret = sobj3.display(str);
        System.out.println("frequency of the space: " + Ret);

        Special sobj4 = new Special();
        Ret = sobj4.display(str);
        System.out.println("frequency of a special: " + Ret);

        sobj.close();
    }
}

class Capital {
    public int display(String str) {
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
}

class Small {
    public int display(String str) {
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
}

class Digit {
    public int display(String str) {
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
}

class Space {
    public int display(String str) {
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
}

class Special {
    public int display(String str) {
        int i = 0;
        int count = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == '@' || arr[i] == '~' || arr[i] == '!' || arr[i] == '#' || arr[i] == '$' ||
                    arr[i] == '%' || arr[i] == '^' || arr[i] == '&' || arr[i] == '*') {
                count++;
            }
        }
        return count;

    }
}