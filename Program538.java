public class Program538 {
    public static void main(String args[]) {
        Divisible dobj = new Divisible();
        dobj.display(30);
    }
}

class Divisible {
    public void display(int num) {
        System.out.println("number divided by 2 and 3:");
        for (int i = 1; i <= num; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println(i);
            }
        }
    }
}
