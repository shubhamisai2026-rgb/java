import java.util.Scanner;

public class Program198 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int GCD = 0;
        System.out.println("enter a first number:");
        num1 = sobj.nextInt();
        System.out.println("enter a second number:");
        num2 = sobj.nextInt();
        if (num1 >= num2) {
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    GCD = i;
                }
            }
        } else {
            for (int i = 1; i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    GCD = i;
                }
            }
        }
        System.out.println("Greatest common devisor: "+GCD);
        sobj.close();
    }
}
