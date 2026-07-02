public class Program522 {
    public static void main(String args[]) {
        Even_Odd eobj = new Even_Odd();
        eobj.display(20);
    }
}

class Even_Odd {
    public void display(int num) {
        int eSum = 0;
        int oSum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                eSum = eSum + i;
            } else {
                oSum = oSum + i;
            }
        }
        System.out.println("addition of the even numbers is: " + eSum);
        System.out.println("addition of the odd numbers is: " + oSum);
    }
}