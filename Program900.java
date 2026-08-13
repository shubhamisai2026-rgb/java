import java.util.LinkedList;
import java.util.Scanner;

public class Program900 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        LinkedList<Integer> lobj = new LinkedList<>();
        int n = 0;
        System.out.println("enter the elements you want to print:");
        n = sobj.nextInt();
        sobj.nextLine();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                lobj.add(i);
            }
        }
        System.out.println("Qualifying numbers:");
        for (int i = 0; i < lobj.size(); i++) {
            System.out.print(lobj.get(i)+"\t");
        }
        System.out.println();
        int largest=0;
        int second_largest=0;
        int sum=0;

        for(int i=0;i<lobj.size();i++)
        {
           if(largest<lobj.get(i))
           {
            second_largest=largest;
            largest=lobj.get(i);
           }
      
           if((lobj.get(i)<largest)&&(second_largest<lobj.get(i)))
           {
            second_largest=lobj.get(i);
           }
        }
        sum=largest+second_largest;
        System.out.println("addition of largest and second_largest number is:"+sum);
        System.out.println("largest number of the list is:"+largest);
        System.out.println("second lergest number of list is:"+second_largest);

        sobj.close();
    }
}
