public class Program525 {
    public static void main(String args[]) {
        Division dobj = new Division();
        dobj.display(55);
    }
}

class Division {
    public void display(int num) {
        if ((num % 5 == 0) && (num % 11 == 0)) {
            System.out.println("number is divisible by 5 and 11");
        } else {
            System.out.println("number is not divisible bt 5 and 11");
        }
    }
}