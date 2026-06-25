import java.util.Scanner;


public class Program441 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        System.out.println("enter a your string:");
        str = sobj.nextLine();

        StringX sobj2 = new StringX();
        String Ret = null;

        Ret = sobj2.display(str);
        System.out.println("the string is:" + Ret);

        sobj.close();

    }
}


class StringX {
    public String display(String str) {
        int i = 0;
        char arr[] = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            arr[i]=(char)(arr[i]-32);
            // java does not accepted this thing because jave not automatically
            // integet into character
        }
        return new String(arr);
    }
}
