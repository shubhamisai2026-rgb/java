public class Program528 {
    public static void main(String args[]) {
        Power pobj = new Power();
        pobj.display(2, 5);
    }
}

class Power {
    public void display(int num, int pow) {
        int ans = 1;
        for (int i = 0; i < pow; i++) {
            ans = ans * num;
        }
        System.out.println("the answer is: " + ans);
    }
}