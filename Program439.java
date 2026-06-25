import java.util.Scanner;


public class Program439 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();

        String Ret = null;
        StringX sobj2 = new StringX();
        Ret = sobj2.display(str);
        System.out.println("updation of the string is:" + Ret);
        sobj.close();
    }
}

class StringX {
    public String display(String str) {
        int i = 0;
        char arr[] = { '\0' };
        arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'A') {
                arr[i] = '_';
            }
        }
        return new String(arr);
    }

}
