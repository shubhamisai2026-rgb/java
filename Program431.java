import java.util.Scanner;


public class Program431 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();
        Capital cobj = new Capital();
        int cRet = cobj.Capital_La(str);
        System.out.println("capital later frequency: " + cRet);
        Small sobj2 = new Small();
        int sRet = sobj2.Small_La(str);
        System.out.println("small later frequency: " + sRet);
        sobj.close();
    }
}


class Capital {
    public int Capital_La(String str) {
        int i = 0;
        int count = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }
}

class Small {
    public int Small_La(String str) {
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
