public class Program520 {
    public static void main(String args[]) {
        Odd obj = new Odd();
        obj.display(20);
    }
}

class Odd {
    public void display(int num) {
        System.out.println("total odd numbers are:");
        for (int i = 1; i <= num; i++)
            
        {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
