import java.util.Scanner;


public class Program432 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();
        Capital cobj = new Capital();
        int iRet = cobj.display(str);
        System.out.println("capital later frequency: " + iRet);

        Small sobj2 = new Small();
        iRet = sobj2.display(str);
        System.out.println("small later frequency: " + iRet);

        sobj.close();

    }
}

class Capital {
    public int display(String str) {
        int i = 0;
        int count = 0;
        char arr[] = str.toCharArray();
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
        char arr[] = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                count++;
            }
        }
        return count;
    }
}
