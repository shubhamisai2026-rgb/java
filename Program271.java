import java.util.Scanner;

class Program271 {
    public static void display(int ino) {
        int icnt = 0;
        for (icnt = 0; icnt < ino; icnt++) {
            System.out.print("*\t");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter a your value:");
        iValue = sobj.nextInt();
        display(iValue);
        sobj.close();
    }
}