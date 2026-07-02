public class Program526 {
    public static void main(String args[]) {
        Digits dobj = new Digits();
        dobj.display(3464);
    }
}

class Digits {
    public void display(int num) {
        int iDigit = 0;
        while (num != 0) {
            iDigit = num % 10;
            System.out.print(iDigit + "\t");
            num = num / 10;
        }
    }
}