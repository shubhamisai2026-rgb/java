public class Program529 {
    public static void main(String args[]) {
        Even eobj = new Even();
        eobj.display(10);
    }
}

class Even {
    public void display(int num) {
        int isum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                isum = i + isum;
            }
        }
        System.out.println("addition of the even digits is: " + isum);
    }
}
