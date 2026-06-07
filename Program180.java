import java.util.Scanner;

class Program180 {
    public static void main(String[] args) {
        int num = 0;
        int iCnt = 0;
        int a = 0, b = 1, c = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter a your number:");
        num = sobj.nextInt();
        System.out.println(c);
        for (iCnt = 0; iCnt < num; iCnt++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        sobj.close();
    }
}