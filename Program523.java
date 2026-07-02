public class Program523 {
    public static void main(String args[]) {
        LeapYear lobj = new LeapYear();
        lobj.display(2024);
    }
}

class LeapYear {
    public void display(int num) {
        if ((num % 4 == 0 || num % 400 == 0) && (num % 100 != 0)) {
            System.out.println("the year is a leap...");
        } else {
            System.out.println("the year is not a leap....");
        }
    }
}
