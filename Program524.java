public class Program524 {
    public static void main(String args[]) {
        Grade gobj = new Grade();
        gobj.display(70);
    }
}

class Grade {
    public void display(int num) {
        if (num > 90) {
            System.out.println("First Class");
        } else if (num > 80 && num <= 90) {
            System.out.println("Grade:A");
        } else if (num > 70 && num <= 80) {
            System.out.println("Grade:B");
        } else if (num > 50 && num <= 70) {
            System.out.println("Grade:C");
        } else if (num >= 35 && num <= 50) {
            System.out.println("pass");
        }
    }
}