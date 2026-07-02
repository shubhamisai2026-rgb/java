class Program519 {
    public static void main(String args[]) {
        Even eobj = new Even();
        eobj.display(20);
    }
}

class Even {
    public void display(int num) {
        System.out.println("all even numbers are:");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}