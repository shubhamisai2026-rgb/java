import java.util.Scanner;

public class Program46 {
    public static void main(String[] args) {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        //NumberX nobj=new NumberX();
        //nobj.FindFactors(iValue);
        NumberX.FindFactors(iValue);
       sobj.close();
    }

}

class NumberX {
    public static void FindFactors(int iNo) {
        int i = 0;
        for (i = 1; i <= iNo; i++) {
            if (iNo % i == 0) {
             System.out.println(i);
            }
        }

    }
}
//timecomplexity:O(N)
//N>0
