public class Program537 {
    public static void main(String args[]) {
        Factors fobj = new Factors();
        fobj.display(342);
    }
}

class Factors {
    public void display(int num) {
        int fact = 0;
        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                fact++;
            }
        }
        System.out.println("total factor counts are: " + fact);
    }
}
