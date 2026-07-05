public class Program535 {
    public static void main(String args[]) {
        Numbers nobj = new Numbers();
        nobj.display(50);
    }
}

class Numbers {
    public void display(int num) {
        int ecount = 0;
        int ocount = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                ecount++;
            } else {
                ocount++;
            }
        }
        System.out.println("even digits are: " + ecount);
        System.out.println("odd digits are: " + ocount);
    }
}