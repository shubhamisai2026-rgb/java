public class Program530 {
    public static void main(String args[]) {
        Reverse robj = new Reverse();
        robj.display(10);
    }
}

class Reverse {
    public void display(int num) {
        System.out.println("reverse digits are:");
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
